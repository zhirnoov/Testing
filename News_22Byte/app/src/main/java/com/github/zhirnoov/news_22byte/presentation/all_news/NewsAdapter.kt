package com.github.zhirnoov.news_22byte.presentation.all_news

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.github.zhirnoov.domain.model.News

class NewsAdapter(val news : List<News>) : RecyclerView.Adapter<NewsAdapter.NewsViewHolder> (){

    class NewsViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount() = news.size
}