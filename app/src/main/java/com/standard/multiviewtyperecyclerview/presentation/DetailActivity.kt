package com.standard.multiviewtyperecyclerview.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.standard.multiviewtyperecyclerview.R
import com.standard.multiviewtyperecyclerview.data.Card
import com.standard.multiviewtyperecyclerview.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_CARD: String = "extra_card"
    }

    private val binding: ActivityDetailBinding by lazy {
        ActivityDetailBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val cardItem = intent.getParcelableExtra<Card>(EXTRA_CARD)

        binding.apply {
            tvDetailName.text = "이름 : " + cardItem!!.userName
            tvDetailCardNum.text = "카드번호 : " + cardItem.cardNumber
            tvDetailPeriod.text = "유효기간 : " + cardItem.period
            tvDetailBalance.text = "가격 : " + cardItem.balance.toString()
        }
    }
}