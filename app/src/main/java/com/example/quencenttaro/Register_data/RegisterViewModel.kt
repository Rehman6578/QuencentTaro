package com.example.quencenttaro.Register_data

class RegisterViewModel(private val registerRepository: RegisterRepository) {

        val datalist = registerRepository.datalist

          fun register(registerUser: Register_user) {

            registerRepository.register(registerUser)
        }
}