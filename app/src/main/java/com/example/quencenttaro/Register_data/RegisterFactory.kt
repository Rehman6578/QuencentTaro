package com.example.quencenttaro.Register_data

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.quencenttaro.RegisterScreen

class RegisterFactory(private val registerRepository: RegisterRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(RegisterScreen::class.java)) {
            return RegisterViewModel(registerRepository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}