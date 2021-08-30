package com.dio.api_nybooks_studie_app.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dio.api_nybooks_studie_app.model.Post
import com.dio.api_nybooks_studie_app.model.SamplePojo
import com.dio.api_nybooks_studie_app.repository.Repository
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Response

class MainViewModel(private val repository: Repository): ViewModel() {

    val myResponse: MutableLiveData<Call<SamplePojo>> = MutableLiveData()

    fun getPost(){
        viewModelScope.launch {
            val response = repository.getPost()
            myResponse.value = response
        }
    }


}