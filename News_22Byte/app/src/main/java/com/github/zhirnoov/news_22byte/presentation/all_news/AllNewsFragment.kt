package com.github.zhirnoov.news_22byte.presentation.all_news

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.github.zhirnoov.news_22byte.R

class AllNewsFragment : Fragment() {

    private lateinit var recyclerView : RecyclerView
    private var newsAdapter = NewsAdapter(emptyList())



//    private val viewModel : NewsViewModel by viewModels {
//    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_all_news, container, false)
        recyclerView = view.findViewById(R.id.news_recycler)
        recyclerView.adapter = newsAdapter
        recyclerView.layoutManager = LinearLayoutManager(context)
        return view
    }
}