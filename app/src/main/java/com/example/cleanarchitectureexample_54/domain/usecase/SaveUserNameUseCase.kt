package com.example.cleanarchitectureexample_54.domain.usecase

import com.example.cleanarchitectureexample_54.domain.model.SaveUserNameParam
import com.example.cleanarchitectureexample_54.domain.repository.UserRepository

class SaveUserNameUseCase(private val userRepository: UserRepository) {

    fun execute(nameParam: SaveUserNameParam): Boolean {
      val result = userRepository.saveName(saveParam = nameParam)
        return result

    }
}