package com.kira.hilttutorial.main

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.kira.hilttutorial.R
import com.kira.hilttutorial.main.user.UserState
import com.kira.hilttutorial.main.user.UserViewModel
import com.kira.hilttutorial.main.user.model.User
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel: UserViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupObserver()
    }

    override fun onResume() {
        super.onResume()
        viewModel.getRandomUsers()
    }

    private fun setupObserver() {
        lifecycleScope.launch {
            viewModel.userState.collect {state ->
                when (state){
                    is UserState.ShowError -> {
                        Log.e("Error: ", state.error.toString())
                    }

                    is UserState.SetResults -> {
                        setupRecyclerView(state.userList)
                    }

                    else -> {
                        Log.e("Error: ", state.toString())
                    }
                }
            }
        }
    }

    private fun setupRecyclerView(userList: List<User>) {

    }
}