package com.github.zhirnoov.data.repositoryImpl


import android.util.Log
import com.github.zhirnoov.data.datasource.NewsRemoteDataSource
import com.github.zhirnoov.domain.model.Article
import com.github.zhirnoov.domain.model.NewsResponse
import com.github.zhirnoov.domain.repository.NewsRepository

class NewsRepositoryImpl(private val newsRemoteDataSource: NewsRemoteDataSource) : NewsRepository {

    override suspend fun get(): List<Article> {
        return newsRemoteDataSource.getNews().body()!!.articles
    }
}