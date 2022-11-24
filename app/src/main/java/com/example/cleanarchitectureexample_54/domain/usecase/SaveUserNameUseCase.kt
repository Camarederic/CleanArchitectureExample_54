package com.example.cleanarchitectureexample_54.domain.usecase

import com.example.cleanarchitectureexample_54.domain.model.SaveUserNameParam

class SaveUserNameUseCase {

    fun execute(nameParam: SaveUserNameParam): Boolean {
        if (nameParam.name.isEmpty()){
            return false
        }else{
            return true
        }
    }
}