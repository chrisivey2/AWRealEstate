package com.example.data.network.simpsons

import com.google.gson.annotations.SerializedName

data class RelatedTopic(
    @SerializedName("SecondURL")
    val firstURL: String,
    @SerializedName("SimpsonsIcon")
    val icon: Icon,
    @SerializedName("SimpsonsResult")
    val result: String,
    @SerializedName("SimpsonsText")
    val text: String
)