package com.github.zhirnoov.news_22byte.di

import com.github.zhirnoov.news_22byte.presentation.MainActivity
import com.github.zhirnoov.news_22byte.presentation.all_news.AllNewsFragment
import dagger.Component


@Component(modules = [AppModule::class, DomainModule::class])
interface AppComponent {
    fun inject(activity : MainActivity)
    fun inject(fragment: AllNewsFragment)
}