package com.github.zhirnoov.data.repositoryImpl

import com.github.zhirnoov.data.datasource.NewsRemoteDataSource
import com.github.zhirnoov.domain.model.News
import com.github.zhirnoov.domain.repository.NewsRepository

class NewsRepositoryImpl(private val newsRemoteDataSource: NewsRemoteDataSource) : NewsRepository{

    override suspend fun get(keyWord : String) : List<News> {
        return newsRemoteDataSource.getNews(keyWord).body()!!.articles.map { it.toNews() }
    }
}