package com.example.domain.domain.usecase

import com.example.domain.domain.model.SaveUserNameParam
import com.example.domain.domain.repository.UserRepository

class SaveUserNameUseCase(private val userRepository: UserRepository) {

    @Suppress("SuspiciousIndentation")
    fun execute(nameParam: SaveUserNameParam): Boolean {

        val oldUserName = userRepository.getName()
        if (oldUserName.firstName == nameParam.name ){
            return true
        }

      val result = userRepository.saveName(saveParam = nameParam)
        return result

    }
}