package com.ru.vimeoapplication

import com.google.gson.annotations.SerializedName

data class VimeConfigResponse(
    @SerializedName("cdn_url") val cdn_url: String?,
    @SerializedName("embed") val embed: Embed?,
    @SerializedName("player_url") val player_url: String?,
    @SerializedName("request") val request: Request?,
    @SerializedName("user") val user: User?,
    @SerializedName("video") val video: Video?,
    @SerializedName("view") val view: Int?,
    @SerializedName("vimeo_api_url") val vimeo_api_url: String?,
    @SerializedName("vimeo_url") val vimeo_url: String
)

data class Embed(
    @SerializedName("api") val api: Any?,
    @SerializedName("app_id") val app_id: String?,
    @SerializedName("autopause") val autopause: Int?,
    @SerializedName("autoplay") val autoplay: Int?,
    @SerializedName("color") val color: String?,
    @SerializedName("context") val context: String?,
    @SerializedName("dnt") val dnt: Int?,
    @SerializedName("editor") val editor: Boolean?,
    @SerializedName("log_plays") val log_plays: Int?,
    @SerializedName("loop") val loop: Int?,
    @SerializedName("muted") val muted: Int?,
    @SerializedName("on_site") val on_site: Int?,
    @SerializedName("outro") val outro: String?,
    @SerializedName("player_id") val player_id: String?,
    @SerializedName("playsinline") val playsinline: Int?,
    @SerializedName("quality") val quality: Any?,
    @SerializedName("settings") val settings: Settings?,
    @SerializedName("texttrack") val texttrack: String?,
    @SerializedName("time") val time: Int?,
    @SerializedName("transparent") val transparent: Int
)

data class Request(
    @SerializedName("ab_tests") val ab_tests: AbTests?,
    @SerializedName("build") val build: Build?,
    @SerializedName("cookie") val cookie: Cookie?,
    @SerializedName("cookie_domain") val cookie_domain: String?,
    @SerializedName("country") val country: String?,
    @SerializedName("currency") val currency: String?,
    @SerializedName("expires") val expires: Int?,
    @SerializedName("file_codecs") val file_codecs: FileCodecs?,
    @SerializedName("files") val files: Files?,
    @SerializedName("flags") val flags: Flags?,
    @SerializedName("gc_debug") val gc_debug: GcDebug?,
    @SerializedName("lang") val lang: String?,
    @SerializedName("referrer") val referrer: Any?,
    @SerializedName("sentry") val sentry: Sentry?,
    @SerializedName("session") val session: String?,
    @SerializedName("signature") val signature: String?,
    @SerializedName("timestamp") val timestamp: Int?,
    @SerializedName("urls") val urls: Urls
)

data class User(
    @SerializedName("account_type") val account_type: String?,
    @SerializedName("id") val id: Int?,
    @SerializedName("liked") val liked: Int?,
    @SerializedName("logged_in") val logged_in: Int?,
    @SerializedName("mod") val mod: Int?,
    @SerializedName("owner") val owner: Int?,
    @SerializedName("team_id") val team_id: Any?,
    @SerializedName("team_origin_user_id") val team_origin_user_id: Any?,
    @SerializedName("vimeo_api_client_token") val vimeo_api_client_token: String?,
    @SerializedName("vimeo_api_interaction_tokens") val vimeo_api_interaction_tokens: Any?,
    @SerializedName("watch_later") val watch_later: Int
)

data class Video(
    @SerializedName("allow_hd") val allow_hd: Int?,
    @SerializedName("bypass_token") val bypass_token: String?,
    @SerializedName("default_to_hd") val default_to_hd: Int?,
    @SerializedName("duration") val duration: Int?,
    @SerializedName("embed_code") val embed_code: String?,
    @SerializedName("embed_permission") val embed_permission: String?,
    @SerializedName("fps") val fps: Double?,
    @SerializedName("hd") val hd: Int?,
    @SerializedName("height") val height: Int?,
    @SerializedName("id") val id: Int?,
    @SerializedName("lang") val lang: Any?,
    @SerializedName("live_event") val live_event: Any?,
    @SerializedName("owner") val owner: Owner?,
    @SerializedName("privacy") val privacy: String?,
    @SerializedName("rating") val rating: Rating?,
    @SerializedName("share_url") val share_url: String?,
    @SerializedName("spatial") val spatial: Int?,
    @SerializedName("thumbs") val thumbs: Thumbs?,
    @SerializedName("title") val title: String?,
    @SerializedName("unlisted_hash") val unlisted_hash: Any?,
    @SerializedName("url") val url: String?,
    @SerializedName("version") val version: Version?,
    @SerializedName("width") val width: Int
)

data class Settings(
    @SerializedName("badge") val badge: Int?,
    @SerializedName("byline") val byline: Int?,
    @SerializedName("collections") val collections: Int?,
    @SerializedName("color") val color: Int?,
    @SerializedName("embed") val embed: Int?,
    @SerializedName("fullscreen") val fullscreen: Int?,
    @SerializedName("info_on_pause") val info_on_pause: Int?,
    @SerializedName("like") val like: Int?,
    @SerializedName("logo") val logo: Int?,
    @SerializedName("playbar") val playbar: Int?,
    @SerializedName("portrait") val portrait: Int?,
    @SerializedName("scaling") val scaling: Int?,
    @SerializedName("share") val share: Int?,
    @SerializedName("spatial_compass") val spatial_compass: Int?,
    @SerializedName("spatial_label") val spatial_label: Int?,
    @SerializedName("speed") val speed: Int?,
    @SerializedName("title") val title: Int?,
    @SerializedName("volume") val volume: Int?,
    @SerializedName("watch_later") val watch_later: Int
)

data class AbTests(
    @SerializedName("cdn_preference") val cdn_preference: CdnPreference?,
    @SerializedName("chromecast") val chromecast: Chromecast?,
    @SerializedName("webvr") val webvr: Webvr
)

data class Build(
    @SerializedName("backend") val backend: String?,
    @SerializedName("js") val js: String
)

data class Cookie(
    @SerializedName("captions") val captions: Any?,
    @SerializedName("hd") val hd: Int?,
    @SerializedName("quality") val quality: Any?,
    @SerializedName("scaling") val scaling: Int?,
    @SerializedName("volume") val volume: Double
)

data class FileCodecs(
    @SerializedName("av1") val av1: List<Any>?,
    @SerializedName("avc") val avc: List<String>?,
    @SerializedName("hevc") val hevc: Hevc
)

data class Files(
    @SerializedName("dash") val dash: Dash?,
    @SerializedName("hls") val hls: Hls?,
    @SerializedName("progressive") val progressive: List<Progressive>
)

data class Flags(
    @SerializedName("autohide_controls") val autohide_controls: Int?,
    @SerializedName("dnt") val dnt: Int?,
    @SerializedName("partials") val partials: Int?,
    @SerializedName("plays") val plays: Int?,
    @SerializedName("preload_video") val preload_video: String
)

data class GcDebug(
    @SerializedName("bucket") val bucket: String
)

data class Sentry(
    @SerializedName("debug_enabled") val debug_enabled: Boolean?,
    @SerializedName("debug_intent") val debug_intent: Int?,
    @SerializedName("enabled") val enabled: Boolean?,
    @SerializedName("url") val url: String
)

data class Urls(
    @SerializedName("barebone_js") val barebone_js: String?,
    @SerializedName("chromeless_css") val chromeless_css: String?,
    @SerializedName("chromeless_js") val chromeless_js: String?,
    @SerializedName("css") val css: String?,
    @SerializedName("fresnel") val fresnel: String?,
    @SerializedName("fresnel_chunk_url") val fresnel_chunk_url: String?,
    @SerializedName("fresnel_manifest_url") val fresnel_manifest_url: String?,
    @SerializedName("fresnel_mimir_inputs_url") val fresnel_mimir_inputs_url: String?,
    @SerializedName("js") val js: String?,
    @SerializedName("js_base") val js_base: String?,
    @SerializedName("mux_url") val mux_url: String?,
    @SerializedName("proxy") val proxy: String?,
    @SerializedName("test_imp") val test_imp: String?,
    @SerializedName("three_js") val three_js: String?,
    @SerializedName("vuid_js") val vuid_js: String
)

data class CdnPreference(
    @SerializedName("data") val data: Data?,
    @SerializedName("group") val group: Boolean?,
    @SerializedName("track") val track: Boolean
)

data class Chromecast(
    val `data`: DataX?,
    @SerializedName("group") val group: Boolean?,
    @SerializedName("track") val track: Boolean
)

data class Webvr(
    val `data`: DataXX?,
    @SerializedName("group") val group: Boolean?,
    @SerializedName("track") val track: Boolean
)

data class Data(
    @SerializedName("city") val city: String?,
    @SerializedName("country_code") val country_code: String?,
    @SerializedName("dash_pref_found") val dash_pref_found: Boolean?,
    @SerializedName("hls_pref_found") val hls_pref_found: Boolean
)

class DataX()

class DataXX()

data class Hevc(
    @SerializedName("hdr") val hdr: List<Any>?,
    @SerializedName("sdr") val sdr: List<Any>
)

data class Dash(
    @SerializedName("cdns") val cdns: Cdns?,
    @SerializedName("default_cdn") val default_cdn: String?,
    @SerializedName("separate_av") val separate_av: Boolean?,
    @SerializedName("streams") val streams: List<Stream>?,
    @SerializedName("streams_avc") val streams_avc: List<StreamsAvc>
)

data class Hls(
    @SerializedName("cdns") val cdns: CdnsX?,
    @SerializedName("default_cdn") val default_cdn: String?,
    @SerializedName("separate_av") val separate_av: Boolean
)

data class Progressive(
    @SerializedName("cdn") val cdn: String?,
    @SerializedName("fps") val fps: Int?,
    @SerializedName("height") val height: Int?,
    @SerializedName("id") val id: String?,
    @SerializedName("mime") val mime: String?,
    @SerializedName("origin") val origin: String?,
    @SerializedName("profile") val profile: Int?,
    @SerializedName("quality") val quality: String?,
    @SerializedName("url") val url: String?,
    @SerializedName("width") val width: Int
)

data class Cdns(
    @SerializedName("akfire_interconnect_quic") val akfire_interconnect_quic: AkfireInterconnectQuic?,
    @SerializedName("fastly_skyfire") val fastly_skyfire: FastlySkyfire
)

data class Stream(
    @SerializedName("fps") val fps: Int?,
    @SerializedName("id") val id: String?,
    @SerializedName("profile") val profile: Int?,
    @SerializedName("quality") val quality: String
)

data class StreamsAvc(
    @SerializedName("fps") val fps: Int?,
    @SerializedName("id") val id: String?,
    @SerializedName("profile") val profile: Int?,
    @SerializedName("quality") val quality: String
)

data class AkfireInterconnectQuic(
    @SerializedName("avc_url") val avc_url: String?,
    @SerializedName("origin") val origin: String?,
    @SerializedName("url") val url: String
)

data class FastlySkyfire(
    @SerializedName("avc_url") val avc_url: String?,
    @SerializedName("origin") val origin: String?,
    @SerializedName("url") val url: String
)

data class CdnsX(
    @SerializedName("akfire_interconnect_quic") val akfire_interconnect_quic: AkfireInterconnectQuicX?,
    @SerializedName("fastly_skyfire") val fastly_skyfire: FastlySkyfireX
)

data class AkfireInterconnectQuicX(
    @SerializedName("avc_url") val avc_url: String?,
    @SerializedName("origin") val origin: String?,
    @SerializedName("url") val url: String
)

data class FastlySkyfireX(
    @SerializedName("avc_url") val avc_url: String?,
    @SerializedName("origin") val origin: String?,
    @SerializedName("url") val url: String
)

data class Owner(
    @SerializedName("account_type") val account_type: String?,
    @SerializedName("id") val id: Int?,
    @SerializedName("img") val img: String?,
    @SerializedName("img_2x") val img_2x: String?,
    @SerializedName("name") val name: String?,
    @SerializedName("url") val url: String
)

data class Rating(
    @SerializedName("id") val id: Int
)

data class Thumbs(
    @SerializedName("1280") val _1280_: String?,
    @SerializedName("640") val _640_: String?,
    @SerializedName("960") val _960_: String?,
    @SerializedName("base") val base: String
)

data class Version(
    @SerializedName("available") val available: List<Available>?,
    @SerializedName("current") val current: Any
)

data class Available(
    @SerializedName("file_id") val file_id: Int?,
    @SerializedName("id") val id: Int?,
    @SerializedName("is_current") val is_current: Int
)