package com.standard.multiviewtyperecyclerview.data.database

import com.standard.multiviewtyperecyclerview.data.database.model.CardEntity

object DataSource {
    fun getCardList(): List<CardEntity> {
        return cardList()
    }
}