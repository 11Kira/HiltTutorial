package com.kira.hilttutorial.main.user

import com.kira.hilttutorial.main.user.model.User

sealed class UserState {
    object ShowLoading: UserState()
    data class SetResults(val userList: List<User>): UserState()
}