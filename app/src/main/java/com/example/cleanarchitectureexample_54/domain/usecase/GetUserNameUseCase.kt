package com.example.cleanarchitectureexample_54.domain.usecase

import com.example.cleanarchitectureexample_54.domain.model.UserName
import com.example.cleanarchitectureexample_54.domain.repository.UserRepository

class GetUserNameUseCase(private val userRepository: UserRepository) {

    fun execute(): UserName {
        return userRepository.getName()
    }
}