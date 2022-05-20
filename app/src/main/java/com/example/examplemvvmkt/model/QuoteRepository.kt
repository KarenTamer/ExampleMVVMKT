package com.example.examplemvvmkt.data.model

import com.example.examplemvvmkt.data.model.network.QuoteService

class QuoteRepository {
    private val api=QuoteService()
    suspend fun getAllQuotes():List<QuoteModel>{
        val response =api.getQuotes()
        QuoteProvider.quotes=response
        return response
    }
}