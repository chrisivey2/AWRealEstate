package com.example.data.network.wire


import com.google.gson.annotations.SerializedName

data class Maintainer(
    @SerializedName("github")
    val github: String
)