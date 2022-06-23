package com.generation.exerccio5.model

data class Categoria(
    var id: Long,
    var descricao: String?,
    var tarefas: List<Tarefa>?
){

    override fun toString(): String {
        return descricao!!
    }

}
// ? p criar apenas com id categoria