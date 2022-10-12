package com.example.exercise1.data

import retrofit2.Response
import retrofit2.http.GET

interface ApiService {
    @GET("/todos")
    suspend fun getTodos(): Response<DataTodo>
}