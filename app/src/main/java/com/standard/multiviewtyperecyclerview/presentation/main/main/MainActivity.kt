package com.standard.multiviewtyperecyclerview.presentation.main.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.standard.multiviewtyperecyclerview.databinding.ActivityMainBinding
import com.standard.multiviewtyperecyclerview.presentation.main.detail.DetailActivity
import com.standard.multiviewtyperecyclerview.presentation.main.model.CardModel

class MainActivity : AppCompatActivity() {
    private val binding : ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    private val cardAdapter : CardAdapter by lazy {
        CardAdapter {
            adapterOnClick(it)
        }
    }

    private lateinit var cardList: List<CardModel>

    private val mainViewModel by viewModels<MainViewModel> {
        MainViewModelFactory()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        initViewModel()
        initData()
    }

    private fun initData() {
        mainViewModel.getCardModel()
    }

    private fun initView() {
        cardAdapter.cardModelList = cardList
        with(binding.recyclerView) {
            adapter = cardAdapter
            layoutManager = LinearLayoutManager(this@MainActivity)
        }
    }

    private fun initViewModel() {
        mainViewModel.getCardModel.observe(this@MainActivity) {
            cardList = it

            initView()
        }
    }

    private fun adapterOnClick(card: CardModel) {
        val intent = Intent(this, DetailActivity::class.java)
        val bundle = Bundle().apply {
            putParcelable(DetailActivity.EXTRA_CARD, card)
        }
        intent.putExtras(bundle)
        startActivity(intent)
    }
}