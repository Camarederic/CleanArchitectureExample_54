package com.example.cleanarchitectureexample_54.domain.repository

import com.example.cleanarchitectureexample_54.domain.model.SaveUserNameParam
import com.example.cleanarchitectureexample_54.domain.model.UserName

interface UserRepository {

    fun saveName(saveParam: SaveUserNameParam):Boolean

    fun getName() : UserName
}