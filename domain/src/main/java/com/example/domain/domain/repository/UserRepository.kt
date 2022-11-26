package com.example.domain.domain.repository

import com.example.domain.domain.model.SaveUserNameParam
import com.example.domain.domain.model.UserName

interface UserRepository {

    fun saveName(saveParam: SaveUserNameParam):Boolean

    fun getName() : UserName
}