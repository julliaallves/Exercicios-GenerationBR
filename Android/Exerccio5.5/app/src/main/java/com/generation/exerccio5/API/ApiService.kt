package com.generation.exerccio5.API

import com.generation.exerccio5.model.Categoria
import com.generation.exerccio5.model.Tarefa
import okhttp3.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT

interface ApiService {

@GET ("categoria")
suspend fun listCategoria(): retrofit2.Response<List<Categoria>>

@POST("tarefa")
suspend fun addTarefa(
    @Body tarefa: Tarefa
) : retrofit2.Response<Tarefa>

@GET ("tarefa")
suspend fun listTarefa(): retrofit2.Response<List<Tarefa>>

@PUT("tarefa")
suspend fun updateTarefa(
    @Body tarefa: Tarefa
): retrofit2.Response<Tarefa>

}