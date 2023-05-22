package com.kira.hilttutorial.main.user

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import javax.inject.Inject

@HiltViewModel
class UserViewModel @Inject constructor(private val userUseCase: UserUseCase): ViewModel() {

    private val mutableUserState: MutableSharedFlow<UserState> = MutableSharedFlow()
    val userState = mutableUserState.asSharedFlow()

}