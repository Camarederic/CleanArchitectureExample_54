package com.example.cleanarchitectureexample_54.data.storage



interface UserStorage {

    fun save(user: User): Boolean

    fun get(): User
}