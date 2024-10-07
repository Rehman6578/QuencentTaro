package com.example.quencenttaro.Auth_api

import com.example.quencenttaro.LoginScreen
import com.example.quencenttaro.Login_data.LoginResponse
import com.example.quencenttaro.Login_data.Login_user
import com.example.quencenttaro.Register_data.RegisterResponse
import com.example.quencenttaro.Register_data.Register_user
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.http.POST

interface ApiService  {

    @POST("api/register")
     fun register(registerUser: Register_user): Response<RegisterResponse>

    @POST("api/login")
     fun sign_in(loginUser: Login_user): Response<LoginResponse>



}