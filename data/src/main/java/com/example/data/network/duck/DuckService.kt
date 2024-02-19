package com.example.data.network.duck

import retrofit2.http.GET

interface DuckService {

    @GET("?q=the+wire+characters&format=json")
    suspend fun getDuck(): DuckModel
}