package com.github.zhirnoov.news_22byte.presentation.all_news

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.github.zhirnoov.domain.model.Article
import com.github.zhirnoov.news_22byte.R
import com.github.zhirnoov.news_22byte.appComponent
import com.github.zhirnoov.news_22byte.presentation.MainActivity
import javax.inject.Inject

class AllNewsFragment : Fragment() {

    @Inject
    lateinit var viewModelFactory: NewsViewModelFactory
    private lateinit var recyclerView: RecyclerView
    private var newsAdapter = NewsAdapter(emptyList())
    private val viewModel: NewsViewModel by viewModels {
        viewModelFactory
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("AAA", "Fragment OnAttach")
        (activity as MainActivity).appComponent.inject(this)
    }

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

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getNews()
    }

    private fun getNews() {
        viewModel.getNews()

        viewModel.newsResponse.observe(viewLifecycleOwner) {
            updateUI(it)
        }
    }

    private fun updateUI(article: List<Article>) {
        newsAdapter = NewsAdapter(article)
        recyclerView.adapter = newsAdapter
    }
}