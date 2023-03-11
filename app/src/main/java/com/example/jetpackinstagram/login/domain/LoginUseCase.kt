package com.example.jetpackinstagram.login.domain

import com.example.jetpackinstagram.login.data.LoginRepository
import javax.inject.Inject

class LoginUseCase @Inject constructor(private val repository: LoginRepository) {

    suspend operator fun invoke(user:String, password:String):Boolean{
        return repository.doLogin(user, password)
    }
}