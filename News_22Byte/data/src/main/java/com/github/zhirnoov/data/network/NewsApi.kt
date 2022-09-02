package com.github.zhirnoov.data.network


import com.github.zhirnoov.data.model.NewsResponse
import com.github.zhirnoov.data.utils.Const.Companion.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface NewsApi {

    @GET("q={keyWord}&apiKey=$API_KEY")
    suspend fun getNews(@Path ("keyWord") keyWord : String): Response<NewsResponse>

}
