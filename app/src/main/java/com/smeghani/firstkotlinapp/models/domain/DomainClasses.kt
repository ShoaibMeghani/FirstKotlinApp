package com.smeghani.firstkotlinapp.models.domain

import android.annotation.SuppressLint
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * Created by shoaibmeghani on 18/01/2018.
 *
 * Since we need specific data to be shown in our app, we will transform api data as per app's requirement.
 */

@SuppressLint("ParcelCreator")
@Parcelize
data class UserList(
        val users : List<User>
): Parcelable{
    val size: Int
        get() = users.size

    //operator overloading to directly access internal list item
    operator fun get(position: Int): User = users[position]
}

// Example of using a parcelable
@SuppressLint("ParcelCreator")
@Parcelize
data class User(
        val id:         Int,
        val name:       String,
        val username:   String,
        val email:      String,
        val address:    String,
        val phone:      String,
        val website:    String

): Parcelable

