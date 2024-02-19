package com.example.data.network.duck


import com.google.gson.annotations.SerializedName

data class SrcOptions(
    @SerializedName("directory")
    val directory: String? = "",
    @SerializedName("is_fanon")
    val isFanon: Int? = 0,
    @SerializedName("is_mediawiki")
    val isMediawiki: Int? = 0,
    @SerializedName("is_wikipedia")
    val isWikipedia: Int? = 0,
    @SerializedName("language")
    val language: String? = "",
    @SerializedName("min_abstract_length")
    val minAbstractLength: String? = "",
    @SerializedName("skip_abstract")
    val skipAbstract: Int? = 0,
    @SerializedName("skip_abstract_paren")
    val skipAbstractParen: Int? = 0,
    @SerializedName("skip_end")
    val skipEnd: String? = "",
    @SerializedName("skip_icon")
    val skipIcon: Int? = 0,
    @SerializedName("skip_image_name")
    val skipImageName: Int? = 0,
    @SerializedName("skip_qr")
    val skipQr: String? = "",
    @SerializedName("source_skip")
    val sourceSkip: String? = "",
    @SerializedName("src_info")
    val srcInfo: String? = ""
)