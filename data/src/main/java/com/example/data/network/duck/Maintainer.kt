package com.example.data.network.duck


import com.google.gson.annotations.SerializedName

data class Maintainer(
    @SerializedName("github")
    val github: String? = ""
)