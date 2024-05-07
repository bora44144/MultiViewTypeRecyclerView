package com.standard.multiviewtyperecyclerview.presentation.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewmodel.CreationExtras
import com.standard.multiviewtyperecyclerview.data.SearchRepositoryImpl
import com.standard.multiviewtyperecyclerview.data.database.DataSource
import com.standard.multiviewtyperecyclerview.presentation.repository.SearchRepository
import com.standard.multiviewtyperecyclerview.presentation.model.CardModel

class MainViewModel(private val searchRepository: SearchRepository) : ViewModel() {
    private val _getCardModel: MutableLiveData<List<CardModel>> = MutableLiveData()
    val getCardModel: LiveData<List<CardModel>> get() = _getCardModel
    fun getCardModel() {
        _getCardModel.value = searchRepository.getCardList()
    }
}

class MainViewModelFactory : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>, extras: CreationExtras): T {
        return MainViewModel(SearchRepositoryImpl(DataSource)) as T
    }
}