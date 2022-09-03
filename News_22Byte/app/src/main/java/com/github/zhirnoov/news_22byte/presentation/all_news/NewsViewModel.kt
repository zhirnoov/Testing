package com.github.zhirnoov.news_22byte.presentation.all_news

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.github.zhirnoov.domain.model.News
import com.github.zhirnoov.domain.usecase.GetAllNewsUseCase
import kotlinx.coroutines.launch

class NewsViewModel(private val getAllNewsUseCase: GetAllNewsUseCase) : ViewModel() {

     val newsResponse: MutableLiveData<List<News>> = MutableLiveData()

    fun getNews(keyWord: String) {
        viewModelScope.launch {
            newsResponse.postValue(getAllNewsUseCase.execute(keyWord))
        }
    }
}