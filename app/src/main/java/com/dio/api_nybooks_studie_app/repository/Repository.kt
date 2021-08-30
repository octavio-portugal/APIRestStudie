package com.dio.api_nybooks_studie_app.repository

import com.dio.api_nybooks_studie_app.API.RetrofitInstance
import com.dio.api_nybooks_studie_app.model.Post
import com.dio.api_nybooks_studie_app.model.SamplePojo
import retrofit2.Call
import retrofit2.Response

class Repository {

    suspend fun getPost(): Call<SamplePojo> {
        return RetrofitInstance.api.getSampleResponse()

    }
}