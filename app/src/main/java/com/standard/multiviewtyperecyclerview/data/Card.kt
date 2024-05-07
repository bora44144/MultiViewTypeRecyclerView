package com.standard.multiviewtyperecyclerview.data

import android.os.Parcelable
import com.standard.multiviewtyperecyclerview.presentation.MultiViewEnum
import kotlinx.parcelize.Parcelize

@Parcelize
data class Card(
    val id: Long,
    val userName: String,
    val cardNumber: String,
    val cardType: String,
    val period: String,
    val balance: Double,
    val cardManager: String,
    val cardViewType: MultiViewEnum
) : Parcelable
