package com.example.data.di

import com.example.data.network.duck.DuckService
import com.example.data.network.simpsons.SimpsonsService
import com.example.data.network.wire.WireService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {

    @Provides
    fun provideOkHttpClient(): OkHttpClient = OkHttpClient
        .Builder().apply {
            this.addInterceptor(HttpLoggingInterceptor().apply {
                level = HttpLoggingInterceptor.Level.BODY
            })
        }
        .readTimeout(15, TimeUnit.SECONDS)
        .connectTimeout(15, TimeUnit.SECONDS)
        .build()

    @Provides
    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit = Retrofit.Builder()
        .baseUrl("https://api.duckduckgo.com/")
        .client(okHttpClient)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    @Provides
    fun provideDuckService(retrofit: Retrofit): DuckService =
        retrofit.create(DuckService::class.java)


    @Provides
    fun provideSimpsonsService(retrofit: Retrofit): SimpsonsService =
        retrofit.create(SimpsonsService::class.java)

    @Provides
    fun provideWireService(retrofit: Retrofit): WireService =
        retrofit.create(WireService::class.java)

}