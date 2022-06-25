package com.generation.exerccio5.model

data class Tarefa (
    var id: Long,
    var nome: String,
    var descricao: String,
    var responsavel: String,
    var data: String,
    var status: Boolean,
    var categoria: Categoria
        ) {
//isso é uma classe de modelo
}