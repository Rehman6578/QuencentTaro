package com.example.quencenttaro.Login_data

import android.util.Log
import com.example.quencenttaro.Auth_api.ApiService

class LoginRepository(private val apiService: ApiService) {


    private val _mutabledatalist = mutableListOf<LoginResponse>()
    val datalist: List<LoginResponse> = _mutabledatalist

    suspend fun sign_in(loginUser: Login_user) {
        val result = apiService.sign_in(loginUser)
        Log.d("TAG", "sign_in: ${result.body()}")

        if(result.body() != null){

            _mutabledatalist.clear()
            _mutabledatalist.add(result.body()!!)

        }
        else{
            Log.d("TAG", "sign_in: ${result.errorBody()}")
        }

    }
}