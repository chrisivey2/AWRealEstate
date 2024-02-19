package com.example.data.network.wire

import retrofit2.http.GET

interface WireService {

    @GET("?q=the+wire+characters&format=json")
    suspend fun getWire(): WireModel
}