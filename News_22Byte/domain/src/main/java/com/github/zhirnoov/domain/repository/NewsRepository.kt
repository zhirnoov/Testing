package com.github.zhirnoov.domain.repository

import com.github.zhirnoov.domain.model.Article

interface NewsRepository {
    suspend fun get() : List<Article>
}