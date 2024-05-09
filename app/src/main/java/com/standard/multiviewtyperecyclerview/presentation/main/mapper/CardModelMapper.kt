package com.standard.multiviewtyperecyclerview.presentation.main.mapper

import com.standard.multiviewtyperecyclerview.data.database.model.CardEntity
import com.standard.multiviewtyperecyclerview.presentation.main.model.CardModel

fun List<CardEntity>.asCardModel(): List<CardModel> {
    return map {
        CardModel(
            it.id,
            it.userName,
            it.cardNumber,
            it.cardType,
            it.period,
            it.balance,
            it.cardManager,
            it.cardViewType
        )
    }
}