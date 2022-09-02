package com.github.zhirnoov.data.datasource

import com.github.zhirnoov.data.model.NewsResponse
import com.github.zhirnoov.data.network.NetworkService
import retrofit2.Response

class NewsRemoteDataSource {


    suspend fun getNews(keyWord: String): Response<NewsResponse> {
        return NetworkService.api.getNews(keyWord)
    }
}