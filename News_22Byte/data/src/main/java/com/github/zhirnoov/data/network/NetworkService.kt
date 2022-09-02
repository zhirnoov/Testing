package com.github.zhirnoov.data.network

import com.github.zhirnoov.data.utils.Const.Companion.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object NetworkService {


    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val api : NewsApi by lazy {
        retrofit.create(NewsApi::class.java)
    }
}