package com.github.zhirnoov.data.model

import com.github.zhirnoov.domain.model.News

data class Article(
    val author: String,
    val content: String,
    val description: String,
    val publishedAt: String,
    val source: Source,
    val title: String,
    val url: String,
    val urlToImage: String
) {

    fun toNews(): News = News(
        author = author, content = content, description = description,
        publishedAt = publishedAt, sourceId = source.id, sourceName = source.name,
        title = title, url = url, urlToImage = urlToImage
    )
}