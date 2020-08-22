package com.main.exercise_retrofit.artist

import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path


interface ArtistAPI{
    @GET("user/{id}")
//    fun getArtistByID(@Path("id")id:String): Call<Artist>
    fun getArtistByID(@Path("id")id:String): Call<WrapperResponse>

    @POST("user")
    fun createArtist(@Body artist: Artist):Call<Artist>
}
