package com.smeghani.firstkotlinapp.models.domain

import com.smeghani.firstkotlinapp.models.api.User
import com.smeghani.firstkotlinapp.models.api.UserApiResponse
import com.smeghani.firstkotlinapp.models.domain.User as UserModel

/**
 * Created by shoaibmeghani on 18/01/2018.
 *
 * This class maps response to domain class.
 */

class UserAPIResponseMapper {


    fun mapResponseToDomainModel(response: UserApiResponse): UserList {
        //there are 2 classes with same name,given specific name in imports (domain.User = UserModel)
        var list: MutableList<UserModel> = mutableListOf<UserModel>()

        //displaying functional programming
        response.users.map { user ->

            val addressStr = "${user.address.suite}, ${user.address.street}, ${user.address.city}"
            val u = UserModel(user.id, user.name, user.username, user.email, addressStr, user.phone, user.website)
            list.add(u)
        }
        val userList = UserList(list)
        return userList
    }
}