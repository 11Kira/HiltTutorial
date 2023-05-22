package com.kira.hilttutorial.main.user

import com.kira.hilttutorial.main.user.model.User
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(private val remoteSource: UserRemoteSource) {
    suspend fun getRandomUsers(): List<User> {
        return remoteSource.getRandomUsers().mapUsersToDomain()
    }
}
