package com.dio.api_nybooks_studie_app.API

import com.dio.api_nybooks_studie_app.model.Post
import com.dio.api_nybooks_studie_app.model.SamplePojo
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface SimpleApi {
    @GET("hardcover-fiction.json?api-key=FVWR9iNfBhiZIgnvCOa4dLjX6ucfK9Wb")
    fun getSampleResponse(): Call<SamplePojo>

//    @GET("hardcover-fiction.json?api-key=FVWR9iNfBhiZIgnvCOa4dLjX6ucfK9Wb")
//    @GET("list.json?api-key=yourkey")
//     suspend fun getPost(
//    @GET("hardcover-fiction.json?api-key=FVWR9iNfBhiZIgnvCOa4dLjX6ucfK9Wb")
//        @Query("yourkey") myKey: String ="FVWR9iNfBhiZIgnvCOa4dLjX6ucfK9Wb",
//        @Query("list") typeList: String = "hardcover-fiction"
//): Response<List<Post>>

}