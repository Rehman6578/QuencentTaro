package com.example.quencenttaro.Register_data

import android.util.Log
import com.example.quencenttaro.Auth_api.ApiService

class RegisterRepository(private val apiService: ApiService) {

    val _mutabledatalist= mutableListOf<RegisterResponse>()
    val datalist: List<RegisterResponse> = _mutabledatalist

     fun register(registerUser: Register_user) {
        val result = apiService.register(registerUser)

        Log.d("TAG", "register: ${result.body()} ")
        if(result.body() != null){
            _mutabledatalist.add(result.body()!!)
        }
        else{
            println("register: ${result.errorBody()}")
        }

    }
}