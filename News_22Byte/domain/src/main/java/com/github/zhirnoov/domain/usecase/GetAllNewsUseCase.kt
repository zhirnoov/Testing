package com.github.zhirnoov.domain.usecase

import com.github.zhirnoov.domain.model.News
import com.github.zhirnoov.domain.repository.NewsRepository
import javax.inject.Inject

class GetAllNewsUseCase @Inject constructor(private val newsRepository: NewsRepository) {

    suspend fun execute(keyWord: String): List<News> {
        return newsRepository.get(keyWord)
    }
}