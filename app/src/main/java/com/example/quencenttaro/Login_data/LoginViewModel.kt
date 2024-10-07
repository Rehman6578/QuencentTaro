package com.example.quencenttaro.Login_data

class LoginViewModel(private val loginRepository: LoginRepository) {

        val datalist = loginRepository.datalist

        suspend fun sign_in(loginUser: Login_user) {
            loginRepository.sign_in(loginUser)


        }
}