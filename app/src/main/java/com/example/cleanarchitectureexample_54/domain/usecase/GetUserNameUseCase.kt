package com.example.cleanarchitectureexample_54.domain.usecase

import com.example.cleanarchitectureexample_54.domain.model.UserName

class GetUserNameUseCase {

    fun execute(): UserName {
        return UserName(firstName = "Ruslan", lastName = "Ibragimov")
    }
}