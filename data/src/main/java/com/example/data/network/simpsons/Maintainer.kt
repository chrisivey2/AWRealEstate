package com.example.data.network.simpsons


import com.google.gson.annotations.SerializedName

data class Maintainer(
    @SerializedName("github")
    val github: String
)