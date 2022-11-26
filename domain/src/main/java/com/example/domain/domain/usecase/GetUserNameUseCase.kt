package com.example.domain.domain.usecase

import com.example.domain.domain.model.UserName
import com.example.domain.domain.repository.UserRepository

class GetUserNameUseCase(private val userRepository: UserRepository) {

    fun execute(): UserName {
        return userRepository.getName()
    }
}