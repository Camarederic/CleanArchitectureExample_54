package com.example.cleanarchitectureexample_54.data.repository

import android.annotation.SuppressLint
import android.content.Context
import android.content.SharedPreferences
import com.example.cleanarchitectureexample_54.data.storage.User
import com.example.cleanarchitectureexample_54.data.storage.UserStorage
import com.example.cleanarchitectureexample_54.domain.model.SaveUserNameParam
import com.example.cleanarchitectureexample_54.domain.model.UserName
import com.example.cleanarchitectureexample_54.domain.repository.UserRepository



class UserRepositoryImpl(private val userStorage: UserStorage) : UserRepository {

    override fun saveName(saveParam: SaveUserNameParam): Boolean {

        val user = User(firstName = saveParam.name, lastName = "")

        val result = userStorage.save(user)
        return result
    }

    override fun getName(): UserName {
        val user = userStorage.get()

        val userName = UserName(firstName = user.firstName, lastName = "")

        return userName

    }
}