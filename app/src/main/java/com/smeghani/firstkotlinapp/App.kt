package com.smeghani.firstkotlinapp

import android.app.Application

/**
 * Created by shoaibmeghani on 20/01/2018.
 */
class App : Application() {

    //showing hot to create singleton in kotlin
    companion object {
        lateinit var appInstance: App
            //so that appInstance is set for once only. We can also use custom delegate
            private set
    }

    override fun onCreate() {
        super.onCreate()
        appInstance = this
    }
}