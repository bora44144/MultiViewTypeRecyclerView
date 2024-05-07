package com.standard.multiviewtyperecyclerview.data.database

import com.standard.multiviewtyperecyclerview.data.entity.CardEntity

object DataSource {
    fun getCardList(): List<CardEntity> {
        return cardList()
    }
}