package com.standard.multiviewtyperecyclerview.presentation.main.model

import android.os.Parcelable
import com.standard.multiviewtyperecyclerview.presentation.main.main.MultiViewEnum
import kotlinx.parcelize.Parcelize

@Parcelize
data class CardModel(
    val id: Long,
    val userName: String,
    val cardNumber: String,
    val cardType: String,
    val period: String,
    val balance: Double,
    val cardManager: String,
    val cardViewType: MultiViewEnum
) : Parcelable