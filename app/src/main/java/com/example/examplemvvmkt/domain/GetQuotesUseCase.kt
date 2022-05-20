package com.example.examplemvvmkt.domain

import com.example.examplemvvmkt.data.model.QuoteModel
import com.example.examplemvvmkt.data.model.QuoteRepository

class GetQuotesUseCase {
    private val repository=QuoteRepository()
    suspend operator fun invoke():List<QuoteModel>?= repository.getAllQuotes()

}