package com.example.jetpackinstagram.login.data.network.response

import com.example.jetpackinstagram.core.network.RetrofitHelper
import com.example.jetpackinstagram.login.data.network.LoginClient
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class LoginService {
    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun doLogin(user: String, password: String):Boolean {
       return withContext(Dispatchers.IO) {
            val response = retrofit.create(LoginClient::class.java).doLogin()
           response.body()?.success?: false     }
    }
}