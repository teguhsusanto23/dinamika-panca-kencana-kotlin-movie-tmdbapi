package com.teguhsusanto.themovie.api

import com.teguhsusanto.themovie.data.GetMoviesResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {

    @GET("tv/popular")
    fun getPopularMovies(
        @Query("api_key") apiKey: String = "8b70861fae70080474a19ce085ffc7a9",
        @Query("page") page: Int
    ): Call<GetMoviesResponse>
}