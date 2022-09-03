package com.github.zhirnoov.data.network


import com.github.zhirnoov.domain.model.NewsResponse
import com.github.zhirnoov.data.utils.Const.Companion.API_KEY
import retrofit2.Response
import retrofit2.http.GET

interface NewsApi {

    @GET("v2/top-headlines?country=ru&apiKey=$API_KEY")
    suspend fun getNews(): Response<NewsResponse>

}
