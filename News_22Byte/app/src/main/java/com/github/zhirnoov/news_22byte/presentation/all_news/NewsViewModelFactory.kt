package com.github.zhirnoov.news_22byte.presentation.all_news

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.github.zhirnoov.domain.usecase.GetAllNewsUseCase
import javax.inject.Inject

class NewsViewModelFactory @Inject constructor(val getAllNewsUseCase: GetAllNewsUseCase) : ViewModelProvider.Factory {


    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(NewsViewModel::class.java)) {
            return NewsViewModel(getAllNewsUseCase) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }

}