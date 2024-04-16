package com.standard.multiviewtyperecyclerview.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.standard.multiviewtyperecyclerview.R
import com.standard.multiviewtyperecyclerview.data.cardList
import com.standard.multiviewtyperecyclerview.databinding.ActivityMainBinding

class CardListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = CardAdapter(cardList())
        binding.recyclerView.adapter = adapter
    }
}