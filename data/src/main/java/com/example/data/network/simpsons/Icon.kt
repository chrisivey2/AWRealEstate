package com.example.data.network.simpsons


import com.google.gson.annotations.SerializedName

data class Icon(
    @SerializedName("Height")
    val height: String,
    @SerializedName("URL")
    val uRL: String,
    @SerializedName("Width")
    val width: String
)