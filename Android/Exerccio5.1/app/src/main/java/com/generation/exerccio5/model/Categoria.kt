package com.generation.exerccio5.model

data class Categoria(
    var id: Long,
    var descricao: String,
    var tarefas: List<Tarefa>
){
}