package com.dio.api_nybooks_studie_app.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.dio.api_nybooks_studie_app.repository.Repository

class MainViewModelFactory(
    private val repository: Repository
    ): ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MainViewModel(repository) as T
    }


}