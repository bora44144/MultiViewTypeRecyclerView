package com.standard.multiviewtyperecyclerview.data

import com.standard.multiviewtyperecyclerview.data.database.DataSource
import com.standard.multiviewtyperecyclerview.presentation.repository.SearchRepository
import com.standard.multiviewtyperecyclerview.presentation.mapper.asCardModel
import com.standard.multiviewtyperecyclerview.presentation.model.CardModel

class SearchRepositoryImpl(private val dataSource: DataSource) : SearchRepository {
    override fun getCardList(): List<CardModel> {
        return dataSource.getCardList().asCardModel()
    }
}