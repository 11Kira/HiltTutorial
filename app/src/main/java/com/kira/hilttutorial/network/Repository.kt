package com.kira.hilttutorial.network

import javax.inject.Inject

class Repository @Inject constructor(private val apiService: ApiService) {
    fun getRandomUser() = apiService.getRandomUser()
}