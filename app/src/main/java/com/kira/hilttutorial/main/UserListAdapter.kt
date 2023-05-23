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

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        if (itemCount > 0) {
            val user = userList[position]
            holder.binding.apply {
                txtId.text = user.id.toString()
                txtUuid.text = user.uid
                txtName.text = "${user.firstName} ${user.lastName}"
                txtUsername.text = user.userName
            }
        }
    }

    override fun getItemCount(): Int = userList.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(DataBindingUtil
            .inflate(
                LayoutInflater.from(parent.context),
                R.layout.item_users,
                parent,
                false
            )
        )

    inner class ViewHolder(
        val binding: ItemUsersBinding
    ) : RecyclerView.ViewHolder(binding.root)
}