package com.github.zhirnoov.news_22byte.di

import com.github.zhirnoov.data.datasource.NewsRemoteDataSource
import com.github.zhirnoov.data.repositoryImpl.NewsRepositoryImpl
import com.github.zhirnoov.domain.repository.NewsRepository
import dagger.Module
import dagger.Provides

@Module
class DomainModule {

    @Provides
    fun provideNewsRepository(newsRemoteDataSource: NewsRemoteDataSource): NewsRepository {
        return NewsRepositoryImpl(newsRemoteDataSource)
    }
}