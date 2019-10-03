package com.nanoyatsu.learn.roomsample

import android.app.Application
import android.content.Context

class RoomApplication : Application() {
    companion object {
        lateinit var appContext: Context
            private set
    }

    override fun onCreate() {
        super.onCreate()
        appContext = applicationContext
    }
}