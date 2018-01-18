package com.smeghani.firstkotlinapp.models.api

import com.google.gson.annotations.SerializedName

/**
 * Created by shoaibmeghani on 17/01/2018.
 *
 * Data classes generated from plugin to hold response.
 */
data class UserApiResponse(
        @SerializedName("users") val users: List<User>
)

data class User(
        @SerializedName("id") val id: Int, //1
        @SerializedName("name") val name: String, //Leanne Graham
        @SerializedName("username") val username: String, //Bret
        @SerializedName("email") val email: String, //Sincere@april.biz
        @SerializedName("address") val address: Address,
        @SerializedName("phone") val phone: String, //1-770-736-8031 x56442
        @SerializedName("website") val website: String, //hildegard.org
        @SerializedName("company") val company: Company
)

data class Company(
        @SerializedName("name") val name: String, //Romaguera-Crona
        @SerializedName("catchPhrase") val catchPhrase: String, //Multi-layered client-server neural-net
        @SerializedName("bs") val bs: String //harness real-time e-markets
)

data class Address(
        @SerializedName("street") val street: String, //Kulas Light
        @SerializedName("suite") val suite: String, //Apt. 556
        @SerializedName("city") val city: String, //Gwenborough
        @SerializedName("zipcode") val zipcode: String, //92998-3874
        @SerializedName("geo") val geo: Geo
)

data class Geo(
        @SerializedName("lat") val lat: String, //-37.3159
        @SerializedName("lng") val lng: String //81.1496
)