package com.standard.multiviewtyperecyclerview.presentation.search.repository

import com.standard.multiviewtyperecyclerview.presentation.main.model.CardModel
import com.standard.multiviewtyperecyclerview.presentation.search.model.GitHubUserListEntity

interface SearchRepository {
    fun getCardList() : List<CardModel>

    suspend fun getGitHubUserList(userName: String) : GitHubUserListEntity
}