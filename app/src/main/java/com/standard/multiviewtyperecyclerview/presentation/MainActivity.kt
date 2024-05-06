package com.standard.multiviewtyperecyclerview.presentation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.standard.multiviewtyperecyclerview.data.Card
import com.standard.multiviewtyperecyclerview.data.DataSource
import com.standard.multiviewtyperecyclerview.data.cardList
import com.standard.multiviewtyperecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding : ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    private val cardAdapter : CardAdapter by lazy {
        CardAdapter { card ->
            adapterOnClick(card)
        }
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val cardList = DataSource.getDataSource().getCardList()
        cardAdapter.cardList = cardList

        with(binding.recyclerView) {
            adapter = cardAdapter
            layoutManager = LinearLayoutManager(this@MainActivity)
        }
    }

    private fun adapterOnClick(card: Card) {
        val intent = Intent(this, DetailActivity::class.java)
        val bundle = Bundle().apply {
            putParcelable(DetailActivity.EXTRA_CARD, card)
        }
        intent.putExtras(bundle)
        startActivity(intent)
    }
}