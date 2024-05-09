package com.standard.multiviewtyperecyclerview.presentation.main.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import com.standard.multiviewtyperecyclerview.data.repository.SearchRepositoryImpl
import com.standard.multiviewtyperecyclerview.data.database.DataSource
import com.standard.multiviewtyperecyclerview.data.network.RetrofitClient
import com.standard.multiviewtyperecyclerview.presentation.search.repository.SearchRepository
import com.standard.multiviewtyperecyclerview.presentation.main.model.CardModel

class MainViewModel(private val searchRepository: SearchRepository) : ViewModel() {
    private val _getCardModel: MutableLiveData<List<CardModel>> = MutableLiveData()
    val getCardModel: LiveData<List<CardModel>> get() = _getCardModel
    fun getCardModel() {
        _getCardModel.value = searchRepository.getCardList()
    }
}

class MainViewModelFactory : ViewModelProvider.Factory {
    private val repository = SearchRepositoryImpl(DataSource, RetrofitClient.searchGitHubUser)
    override fun <T : ViewModel> create(modelClass: Class<T>, extras: CreationExtras): T {
        return MainViewModel(repository) as T
    }
}