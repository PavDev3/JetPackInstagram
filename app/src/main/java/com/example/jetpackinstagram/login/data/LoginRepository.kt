package com.example.jetpackinstagram.login.data

import com.example.jetpackinstagram.login.data.network.response.LoginService

class LoginRepository {
    private val api = LoginService()

    suspend fun doLogin(user:String, password: String):Boolean{
        return api.doLogin(user, password)
    }
}