package com.smeghani.firstkotlinapp.ui

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.smeghani.firstkotlinapp.R
import com.smeghani.firstkotlinapp.models.domain.User
import com.smeghani.firstkotlinapp.models.domain.UserList
import kotlinx.android.synthetic.main.item_user.view.*

/**
 * Created by shoaibmeghani on 18/01/2018.
 */
class UserListAdapter(private val userList: UserList, private val userClick: (User) -> Unit) : RecyclerView.Adapter<UserListAdapter.ViewHolder>() {
    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        if (holder != null)
            holder.bind(userList[position], userClick)
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent!!.context).inflate(R.layout.item_user, parent, false)
        return ViewHolder(view)
    }


    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(user: User, userClick: (User) -> Unit) {
            with(itemView) {
                name.text = user.name
                email.text = user.email
                //using lambda for click listener
                setOnClickListener { userClick(user) }
            }
        }


    }
}