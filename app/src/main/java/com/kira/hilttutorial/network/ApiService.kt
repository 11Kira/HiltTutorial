package com.kira.hilttutorial.network

import com.kira.hilttutorial.model.User
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("beer/random_beer")
    fun getRandomBeer(): Response<List<User>>
}