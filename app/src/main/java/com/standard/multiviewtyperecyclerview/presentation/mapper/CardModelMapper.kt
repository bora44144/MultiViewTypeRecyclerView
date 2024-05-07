package com.standard.multiviewtyperecyclerview.presentation.mapper

import com.standard.multiviewtyperecyclerview.data.entity.CardEntity
import com.standard.multiviewtyperecyclerview.presentation.model.CardModel

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