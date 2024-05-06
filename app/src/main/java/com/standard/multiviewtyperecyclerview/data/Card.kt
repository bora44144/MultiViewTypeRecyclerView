package com.standard.multiviewtyperecyclerview.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Card(
    val name: String,
    val number: String,
    val period: String,
    val balance: String
) : Parcelable
