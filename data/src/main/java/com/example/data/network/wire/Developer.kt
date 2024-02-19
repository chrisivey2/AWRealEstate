package com.example.data.network.wire


import com.google.gson.annotations.SerializedName

data class Developer(
    @SerializedName("name")
    val name: String,
    @SerializedName("type")
    val type: String,
    @SerializedName("url")
    val url: String
)