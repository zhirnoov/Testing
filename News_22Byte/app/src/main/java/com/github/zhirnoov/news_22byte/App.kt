package com.github.zhirnoov.news_22byte

import android.app.Application
import com.github.zhirnoov.news_22byte.di.AppComponent
import com.github.zhirnoov.news_22byte.di.DaggerAppComponent

class App : Application() {


    lateinit var appComponent : AppComponent

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent.create()
    }
}