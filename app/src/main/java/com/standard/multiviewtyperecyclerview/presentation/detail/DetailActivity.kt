package com.standard.multiviewtyperecyclerview.presentation.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.standard.multiviewtyperecyclerview.databinding.ActivityDetailBinding
import com.standard.multiviewtyperecyclerview.extension.getParcelableExtra
import com.standard.multiviewtyperecyclerview.presentation.model.CardModel

class DetailActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_CARD: String = "extra_card"
    }

    private val binding: ActivityDetailBinding by lazy {
        ActivityDetailBinding.inflate(layoutInflater)
    }

    private val cardModel by getParcelableExtra<CardModel>(EXTRA_CARD)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        initView()
    }

    private fun initView() {
        binding.apply {
            tvDetailName.text = "이름 : " + cardModel?.userName
            tvDetailCardNum.text = "카드번호 : " + cardModel?.cardNumber
            tvDetailPeriod.text = "유효기간 : " + cardModel?.period
            tvDetailBalance.text = "가격 : " + cardModel?.balance.toString()
        }
    }
}