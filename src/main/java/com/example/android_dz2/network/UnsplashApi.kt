package com.example.android_dz2.network

import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface UnsplashApi {
    @Headers("Authorization: Client-ID hhaWVZi1mPifvwJzzsx-rxiEvNmAs2c7zOQZKZ6-kvA")
    @GET("photos/")
    suspend fun getRandomPhotos(
        @Query("page") page: Int,
        @Query("per_page") perPage: Int
    ): List<UnsplashPhoto>
}