package com.example.home.data

import retrofit2.http.GET

interface HomeApi {

    @GET("banner/json")
    suspend fun getBanners(): BannerResponse
}