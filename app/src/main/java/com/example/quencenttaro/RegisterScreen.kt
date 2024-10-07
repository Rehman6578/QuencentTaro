package com.example.quencenttaro

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.quencenttaro.Auth_api.ApiService
import com.example.quencenttaro.Auth_api.Retrofit_Instance
import com.example.quencenttaro.Register_data.RegisterFactory
import com.example.quencenttaro.Register_data.RegisterRepository
import com.example.quencenttaro.Register_data.RegisterViewModel
import com.example.quencenttaro.Register_data.Register_user
import com.example.quencenttaro.databinding.ActivityRegisterScreenBinding

class RegisterScreen : AppCompatActivity() {

    lateinit var binding: ActivityRegisterScreenBinding
    lateinit var registerRepository: RegisterRepository
    lateinit var registerViewModel: RegisterViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityRegisterScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)


        var apiService = Retrofit_Instance.getinstance().create(ApiService::class.java)
        registerRepository = RegisterRepository(apiService)

        registerViewModel =
            ViewModelProvider(
                this,
                RegisterFactory(registerRepository)).get(registerViewModel::class.java)



        binding.registerButton.setOnClickListener {

            var name = binding.username.text.toString()
            var email = binding.email.text.toString()
            var password = binding.password.text.toString()
            var confirmPassword = binding.confirmpassword.text.toString()

            // check for empty fields
            if (name.isEmpty() || email.isEmpty() || password.isEmpty()) {
                // show error message
            } else {
                // check if password and confirm password match
                if (password != confirmPassword) {
                    // show error message
                } else {
                    register(name, email, password)
                }

            }


//            registerViewModel.datalist.observe(this) {
//                // check if the response is successful
//                if (it.isNotEmpty()) {
//                    // show success message
//                } else {
//                    // show error message
//                }
//            }


        }
    }

        fun register(name: String, email: String, password: String) {

            // add this function inside the corutines scope
            registerViewModel.register(Register_user(name, email, password))

        }

}