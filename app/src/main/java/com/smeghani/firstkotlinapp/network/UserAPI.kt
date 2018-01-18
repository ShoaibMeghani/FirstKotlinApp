package com.smeghani.firstkotlinapp.network

import com.google.gson.Gson
import com.smeghani.firstkotlinapp.models.api.UserApiResponse
import com.smeghani.firstkotlinapp.models.domain.UserAPIResponseMapper
import com.smeghani.firstkotlinapp.models.domain.UserList
import java.net.URL

/**
 * Created by shoaibmeghani on 17/01/2018.
 */
class UserAPI {

    // alternate to static variables in java
    companion object {
         private val API_URL = "https://my-json-server.typicode.com/shoaibmeghani/mockrest/db"
    }

    fun getUsers() : UserList {
        val userJsonStr = URL(API_URL).readText()
        return UserAPIResponseMapper().mapResponseToDomainModel(
                Gson().fromJson(userJsonStr, UserApiResponse::class.java))
    }
}