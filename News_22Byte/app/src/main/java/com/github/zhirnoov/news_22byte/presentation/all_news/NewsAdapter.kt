package com.github.zhirnoov.news_22byte.presentation.all_news

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.github.zhirnoov.domain.model.Article
import com.github.zhirnoov.domain.model.NewsResponse
import com.github.zhirnoov.news_22byte.R

class NewsAdapter(val article: List<Article>) : RecyclerView.Adapter<NewsAdapter.NewsViewHolder>() {

    class NewsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title: TextView = itemView.findViewById(R.id.tv_title)
        val desc: TextView = itemView.findViewById(R.id.tv_desc)
        val date: TextView = itemView.findViewById(R.id.tv_date)
        val imageNews: ImageView = itemView.findViewById(R.id.image_news)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.news_row_item, parent, false)
        return NewsViewHolder(view)
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        val article = article[position]
        holder.title.text = article.title
        holder.desc.text = article.description
        holder.date.text = article.publishedAt.substring(11, 16)
        holder.imageNews.load(article.urlToImage)

    }

    override fun getItemCount() = article.size
}