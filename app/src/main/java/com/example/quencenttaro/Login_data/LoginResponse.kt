package com.example.quencenttaro.Login_data

import android.provider.ContactsContract.CommonDataKinds.Email

data class LoginResponse(
    var id: Int,
    var email: String,
    val username: String,
    val password: String

)
