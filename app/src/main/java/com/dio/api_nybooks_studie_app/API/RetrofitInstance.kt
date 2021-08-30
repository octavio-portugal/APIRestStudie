package com.dio.api_nybooks_studie_app.API

import com.dio.api_nybooks_studie_app.model.SamplePojo
import com.dio.api_nybooks_studie_app.util.Constants.Companion.BASE_URL
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create


object RetrofitInstance {

    private val retrofit by lazy{
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val api: SimpleApi by lazy{
        retrofit.create(SimpleApi::class.java)
    }
    public val call: Call<SamplePojo> = api.getSampleResponse()


}