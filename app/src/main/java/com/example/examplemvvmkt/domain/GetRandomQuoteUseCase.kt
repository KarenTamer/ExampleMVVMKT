package com.example.examplemvvmkt.domain

import com.example.examplemvvmkt.data.model.QuoteModel
import com.example.examplemvvmkt.data.model.QuoteProvider
import com.example.examplemvvmkt.data.model.QuoteRepository
import com.example.examplemvvmkt.ui.viewmodel.QuoteViewModel

class GetRandomQuoteUseCase {
    private val repository=QuoteRepository()
    operator fun invoke(): QuoteModel?{
        val quotes=QuoteProvider.quotes
        if(!quotes.isNullOrEmpty()){
            val randomNumber:Int=(quotes.indices).random()
            return quotes[randomNumber]
        }
        return null
    }
}