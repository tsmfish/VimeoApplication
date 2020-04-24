package com.ru.vimeoapplication

import android.content.Context
import android.graphics.Color
import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.webkit.WebView
import android.widget.*
import com.readystatesoftware.chuck.ChuckInterceptor
import okhttp3.OkHttpClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Path
import java.lang.Exception
import java.util.regex.Pattern

class MainActivity : AppCompatActivity() {
    private val LOG_TAG by lazy { MainActivity::class.simpleName }

    private val api by lazy { Api(this) }
    private val videoView by lazy {
        findViewById<VideoView>(R.id.view)?.apply {
            mediaController = null
            setBackgroundColor(Color.TRANSPARENT)
            setOnPreparedListener {
                Log.d(LOG_TAG, "videoView::OnPreparedListener()")
                seekBar?.max = it.duration
                requestFocus()
                start()
                player = it
            }
            setOnCompletionListener {mediaPlayer ->
                Log.d(LOG_TAG, "videoView::OnCompletion()")
                mediaPlayer.release()
            }
        }
    }
    private var player: MediaPlayer? = null
    private val seekBar by lazy { findViewById<SeekBar>(R.id.seekbar) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.play)?.setOnClickListener { videoView?.start() }
        findViewById<Button>(R.id.pause)?.setOnClickListener { videoView?.pause() }
        findViewById<ImageButton>(R.id.parce_video)?.setOnClickListener {
            val source = findViewById<EditText>(R.id.source)?.text
            if (source?.isBlank() == false) {
                try {
                    val matcher =
                        Pattern.compile("https?://vimeo.com/(\\d+)", Pattern.CASE_INSENSITIVE)
                            .matcher(source).apply {
//                            find()
                        }
//                    Log.d(LOG_TAG, "source [$source], replace: [${matcher.group(1)}]")
                    if (matcher.find()) {
                        api.getConfig(matcher.group(1))
                            .enqueue(object : Callback<VimeConfigResponse> {
                                override fun onFailure(
                                    call: Call<VimeConfigResponse>,
                                    t: Throwable
                                ) {
                                    t.printStackTrace()
                                }

                                override fun onResponse(
                                    call: Call<VimeConfigResponse>,
                                    response: Response<VimeConfigResponse>
                                ) {
//                                    Log.d(LOG_TAG, "$response")
                                    if (response.isSuccessful) {
                                        response.body()?.request?.files?.progressive?.get(0)?.url?.let {
                                            playVideo(it)
                                        }
                                    }
                                }
                            })
                    }
                } catch (e: Exception) {
                    e.printStackTrace()
                }
            }
        }
        seekBar?.setOnSeekBarChangeListener(
            object: SeekBar.OnSeekBarChangeListener {
                override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {}

                override fun onStartTrackingTouch(p0: SeekBar?) {
                    player?.pause()
                }

                override fun onStopTrackingTouch(p0: SeekBar?) {
                    player?.let {
                        it.seekTo(seekBar?.progress!!)
                        player?.start()
                    }
                }

            }
        )
    }

    fun playVideo(url: String) {
        videoView?.setVideoURI(Uri.parse(url))
    }
}

interface Api {
    @GET("video/{id}/config")
    fun getConfig(
        @Path("id") id: String
    ) : Call<VimeConfigResponse>

    companion object{
        operator fun invoke(context: Context) : Api = Retrofit.Builder().apply {
            baseUrl("https://player.vimeo.com/")
            client(
                OkHttpClient.Builder().apply {
                    addInterceptor(ChuckInterceptor(context))
                }.build()
            )
            addConverterFactory(GsonConverterFactory.create())
        }.build().create(Api::class.java)
    }
}
