package com.kira.hilttutorial.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.kira.hilttutorial.R
import com.kira.hilttutorial.databinding.ItemUsersBinding
import com.kira.hilttutorial.main.user.model.User
import javax.inject.Inject

class UserListAdapter @Inject constructor(
    private var userList: List<User>
) : RecyclerView.Adapter<UserListAdapter.ViewHolder>() {

    lateinit var binding: ItemUsersBinding

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        if (itemCount > 0) {
            val user = userList[position]
            holder.apply {
                binding.txtId.text = user.id.toString()
                binding.txtUuid.text = user.uid
                binding.txtName.text = "${user.firstName} ${user.lastName}"
                binding.txtUsername.text = user.userName

            }
        }
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        binding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.item_users,
            parent,
            false
        )
        return ViewHolder(binding)
    }

    inner class ViewHolder(
        val binding: ItemUsersBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        init {

        }
    }
}