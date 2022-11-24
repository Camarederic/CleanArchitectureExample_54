package com.example.cleanarchitectureexample_54.data.repository

import com.example.cleanarchitectureexample_54.domain.model.SaveUserNameParam
import com.example.cleanarchitectureexample_54.domain.model.UserName
import com.example.cleanarchitectureexample_54.domain.repository.UserRepository

class UserRepositoryImpl : UserRepository {

    override fun saveName(saveParam: SaveUserNameParam):Boolean{

        return true
    }

    override fun getName() : UserName{

        return UserName(firstName = "Ruslan", lastName = "Hello from repository")
    }
}