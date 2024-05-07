package com.standard.multiviewtyperecyclerview.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.standard.multiviewtyperecyclerview.data.Card
import com.standard.multiviewtyperecyclerview.data.DataSource

class CardViewModel(val dataSource: DataSource) : ViewModel() {
    val cardLiveData = dataSource.getCardList()

    fun getCardForId(id: Long) : Card {
        return cardLiveData.get(id.toInt())
    }
}

class CardViewModelFactory : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass : Class<T>) : T {
        if (modelClass.isAssignableFrom(CardViewModel::class.java)) {
            return CardViewModel(dataSource = DataSource.getDataSource()) as T
        }
        throw IllegalArgumentException("Unknown ViewModel Class")
    }
}