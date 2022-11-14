package com.example.my_application.api

import com.example.my_application.models.Post
import retrofit2.http.GET

interface SimpleApi {

    @GET("posts/1")
    suspend fun getPost(): Post


}