package com.example.examplemvvmkt.data.model.network

import com.example.examplemvvmkt.core.RetrofitHelper
import com.example.examplemvvmkt.data.model.QuoteModel

import retrofit2.http.GET

interface QuoteApiClient {
    @GET("/.json")
    suspend fun getAllQuotes():retrofit2.Response<List<QuoteModel>>
}
