package com.standard.multiviewtyperecyclerview.presentation.repository

import com.standard.multiviewtyperecyclerview.presentation.model.CardModel

interface SearchRepository {
    fun getCardList() : List<CardModel>
}