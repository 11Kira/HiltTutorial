package com.kira.hilttutorial.main.user

import com.kira.hilttutorial.main.user.model.User
import retrofit2.Response

fun Response<List<User>>.mapUsersToDomain(): List<User> {
    return this.body()?.map { user ->
        User(
            id = user.id,
            uid = user.uid,
            firstName = user.firstName,
            lastName = user.lastName,
            userName = user.userName
        )
    } ?: emptyList()
}