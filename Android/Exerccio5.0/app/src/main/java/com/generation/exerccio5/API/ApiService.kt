package com.generation.exerccio5.API

import com.generation.exerccio5.model.Categoria
import okhttp3.Response
import retrofit2.http.GET

interface ApiService {

@GET ("categoria")
suspend fun listCategoria(): retrofit2.Response<List<Categoria>>

}