package com.kira.hilttutorial.network

import com.kira.hilttutorial.model.User
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("users/random_user?size=3")
    fun getRandomUser(): Response<List<User>>
}