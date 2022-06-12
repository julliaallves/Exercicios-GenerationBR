package com.generation.exerccio5.API

import com.generation.exerccio5.util.Constantes
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {

    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(Constantes.BASE_URL) //n vamos colocar aq p ficar mais seguro
            .addConverterFactory(GsonConverterFactory.create()) //p converter o Json
            .build()
    }

    val api: ApiService by lazy {
        retrofit.create(ApiService::class.java)
    }

}