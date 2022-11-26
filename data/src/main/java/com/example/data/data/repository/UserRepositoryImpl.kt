package com.example.data.data.repository


import com.example.data.data.storage.User
import com.example.data.data.storage.UserStorage
import com.example.domain.domain.model.SaveUserNameParam
import com.example.domain.domain.model.UserName
import com.example.domain.domain.repository.UserRepository


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