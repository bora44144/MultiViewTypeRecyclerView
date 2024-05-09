package com.standard.multiviewtyperecyclerview.data.repository

import com.standard.multiviewtyperecyclerview.data.database.DataSource
import com.standard.multiviewtyperecyclerview.data.remote.remote.SearchRemoteDataSource
import com.standard.multiviewtyperecyclerview.presentation.search.repository.SearchRepository
import com.standard.multiviewtyperecyclerview.presentation.main.mapper.asCardModel
import com.standard.multiviewtyperecyclerview.presentation.search.mapper.toEntity
import com.standard.multiviewtyperecyclerview.presentation.main.model.CardModel
import com.standard.multiviewtyperecyclerview.presentation.search.model.GitHubUserListEntity

class SearchRepositoryImpl(private val dataSource: DataSource, private val remoteDataSource: SearchRemoteDataSource) :
    SearchRepository {
    override fun getCardList(): List<CardModel> {
        return dataSource.getCardList().asCardModel()
    }

    override suspend fun getGitHubUserList(userName: String): GitHubUserListEntity = remoteDataSource.getGitHubUser(userName).toEntity()
}