package com.kira.hilttutorial.main.user

import com.kira.hilttutorial.main.user.model.User
import javax.inject.Inject

class UserUseCase @Inject constructor(private val userRepositoryImpl: UserRepositoryImpl) {
    suspend fun getRandomUsers(): List<User> {
        return userRepositoryImpl.getRandomUsers()
    }
}