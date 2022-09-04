package com.github.zhirnoov.news_22byte.presentation.all_news

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.github.zhirnoov.domain.model.Article
import com.github.zhirnoov.domain.usecase.GetAllNewsUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class NewsViewModel(val getAllNewsUseCase: GetAllNewsUseCase) : ViewModel() {

    val newsResponse: MutableLiveData<List<Article>> = MutableLiveData()

    fun getNews() {
        viewModelScope.launch(Dispatchers.IO) {
            newsResponse.postValue(getAllNewsUseCase.execute())
        }
    }
}