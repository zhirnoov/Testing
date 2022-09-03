package com.github.zhirnoov.news_22byte.di

import com.github.zhirnoov.data.datasource.NewsRemoteDataSource
import com.github.zhirnoov.domain.usecase.GetAllNewsUseCase
import com.github.zhirnoov.news_22byte.presentation.all_news.NewsViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class AppModule {

    @Provides
    fun provideNewsViewModelFactory(getAllNewsUseCase: GetAllNewsUseCase): NewsViewModelFactory {
        return NewsViewModelFactory(getAllNewsUseCase)
    }
}