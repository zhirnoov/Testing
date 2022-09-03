package com.github.zhirnoov.news_22byte

import android.app.Application
import android.content.Context
import android.util.Log
import com.github.zhirnoov.news_22byte.di.AppComponent
import com.github.zhirnoov.news_22byte.di.DaggerAppComponent

class App : Application() {


    lateinit var appComponent : AppComponent

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.create()
        Log.d("AAA", "Application OnCreate")
    }
}

val Context.appComponent: AppComponent
    get() = when (this) {
        is App -> appComponent
        else -> this.applicationContext.appComponent
    }