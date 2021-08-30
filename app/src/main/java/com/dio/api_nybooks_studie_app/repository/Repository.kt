package com.dio.api_nybooks_studie_app.repository

import com.dio.api_nybooks_studie_app.API.RetrofitInstance
import com.dio.api_nybooks_studie_app.model.Post
import com.dio.api_nybooks_studie_app.model.SamplePojo
import com.dio.api_nybooks_studie_app.model.SamplePojoList
import retrofit2.Call
import retrofit2.Response

class Repository {

    suspend fun getPost(): Call<SamplePojoList> {
        return RetrofitInstance.api.getSampleResponse()

    }
}