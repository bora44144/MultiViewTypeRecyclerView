package com.standard.multiviewtyperecyclerview.data.entity

import com.standard.multiviewtyperecyclerview.presentation.main.MultiViewEnum

data class CardEntity(
    val id: Long,
    val userName: String,
    val cardNumber: String,
    val cardType: String,
    val period: String,
    val balance: Double,
    val cardManager: String,
    val cardViewType: MultiViewEnum
)
