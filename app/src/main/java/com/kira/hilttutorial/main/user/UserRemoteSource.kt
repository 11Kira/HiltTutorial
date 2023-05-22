package com.kira.hilttutorial.main.user

import com.kira.hilttutorial.network.ApiService
import javax.inject.Inject

class UserRemoteSource @Inject constructor(
    private val apiService: ApiService
) {
    suspend fun getRandomUsers() = apiService.getRandomUser()
}