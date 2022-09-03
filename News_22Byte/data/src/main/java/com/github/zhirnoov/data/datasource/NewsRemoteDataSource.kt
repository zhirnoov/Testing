package com.github.zhirnoov.data.datasource

import com.github.zhirnoov.domain.model.NewsResponse
import com.github.zhirnoov.data.network.NetworkService
import com.github.zhirnoov.data.utils.Const.Companion.API_KEY
import retrofit2.Response
import javax.inject.Inject

class NewsRemoteDataSource @Inject constructor() {


    suspend fun getNews(): Response<NewsResponse> {
        return NetworkService.api.getNews()
    }
}