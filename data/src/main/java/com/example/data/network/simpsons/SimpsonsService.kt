package com.example.data.network.simpsons

import retrofit2.http.GET

interface SimpsonsService {

    @GET("?q=simpsons+characters&format=json")
    suspend fun getSimpsons(): SimpsonsModel
}
