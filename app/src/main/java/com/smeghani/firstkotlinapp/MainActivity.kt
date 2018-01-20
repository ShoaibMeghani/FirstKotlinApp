package com.smeghani.firstkotlinapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.smeghani.firstkotlinapp.network.UserAPI
import com.smeghani.firstkotlinapp.ui.UserListFragment
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().add(R.id.container, UserListFragment(), "UserList").commit()


    }
}

