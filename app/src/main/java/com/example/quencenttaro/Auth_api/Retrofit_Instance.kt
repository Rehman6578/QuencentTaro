package com.example.quencenttaro.Auth_api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object  Retrofit_Instance {

    const val BASE_URL = "https://projects.funtashtechnologies.com/bookreading-dashbaord/"

    fun getinstance(): Retrofit {
        return Retrofit.Builder().baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create()).build()
    }

}