package com.github.zhirnoov.domain.repository

import com.github.zhirnoov.domain.model.News

interface NewsRepository {

    suspend fun get(keyWord : String) : List<News>
}