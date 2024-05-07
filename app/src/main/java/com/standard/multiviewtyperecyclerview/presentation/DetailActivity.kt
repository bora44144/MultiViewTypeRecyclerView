package com.standard.multiviewtyperecyclerview.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import com.standard.multiviewtyperecyclerview.data.Card
import com.standard.multiviewtyperecyclerview.databinding.ActivityDetailBinding
import com.standard.multiviewtyperecyclerview.extension.extraNotNull

class DetailActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_CARD: String = "extra_card"
    }

    private val binding: ActivityDetailBinding by lazy {
        ActivityDetailBinding.inflate(layoutInflater)
    }

    private val cardViewModel by viewModels<CardViewModel> {
        CardViewModelFactory()
    }

    private val cardId by extraNotNull<Long>(EXTRA_CARD)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

//        val cardItem = intent.getParcelableExtra<Card>(EXTRA_CARD)
//        val cardData = DataSource.getDataSource().getCardForId(cardId)
        val cardData = cardViewModel.getCardForId(cardId)
        Log.d("debug100", cardViewModel.getCardForId(cardId).toString())

        binding.apply {
            tvDetailName.text = "이름 : " + cardData!!.userName
            tvDetailCardNum.text = "카드번호 : " + cardData.cardNumber
            tvDetailPeriod.text = "유효기간 : " + cardData.period
            tvDetailBalance.text = "가격 : " + cardData.balance.toString()
        }
    }
}