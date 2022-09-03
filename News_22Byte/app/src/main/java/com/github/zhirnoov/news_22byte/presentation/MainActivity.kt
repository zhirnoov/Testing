package com.github.zhirnoov.news_22byte.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.github.zhirnoov.news_22byte.R
import com.github.zhirnoov.news_22byte.appComponent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("AAA", "Activity OnCreate")
        appComponent.inject(this)
    }
}