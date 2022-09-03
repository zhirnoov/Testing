package com.github.zhirnoov.domain.usecase
import com.github.zhirnoov.domain.model.Article
import com.github.zhirnoov.domain.model.NewsResponse
import com.github.zhirnoov.domain.repository.NewsRepository
import javax.inject.Inject

class GetAllNewsUseCase @Inject constructor(val newsRepository: NewsRepository) {

    suspend fun execute(): List<Article> {
        return newsRepository.get()
    }
}