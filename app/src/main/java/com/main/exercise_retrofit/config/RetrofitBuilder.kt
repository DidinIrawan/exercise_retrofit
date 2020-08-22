package com.main.exercise_retrofit.config

import com.google.gson.Gson
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitBuilder {
    companion object {
        val BASE_URL = "http://192.168.43.127:7000/"

        fun createRetrofit(): Retrofit {
            val retrofit = Retrofit.Builder().baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create()).build()
            return retrofit
        }
    }
}