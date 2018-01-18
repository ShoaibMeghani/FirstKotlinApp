package com.smeghani.firstkotlinapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.smeghani.firstkotlinapp.network.UserAPI
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val api = UserAPI()

        // using Anko Coroutines to run task on background
        doAsync {
            var response = api.getUsers()
            uiThread {
                for (user in response.users) {
                    tv_data.text = tv_data.text.toString() + "\n" + user.address
                }
            }
        }


    }
}

