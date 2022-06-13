package com.generation.exerccio5.API

import com.generation.exerccio5.model.Categoria
import retrofit2.Response

class Repository {

    suspend fun listCategoria(): Response <List<Categoria>>{
        return RetrofitInstance.api.listCategoria()
    }

}