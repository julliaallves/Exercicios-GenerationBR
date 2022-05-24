package Exerc1e2POO

class Patinete(
    var Rodas: Int,
    var Freio: Boolean,
    var Guidao: Boolean,
    var Cor: String
) {

    var completo = "sim"
    var colorido = "colorido"


    fun cor() {
        println("Qual cor de patinete deseja comprar?")
        var cor = readln()

        if (cor == colorido) {
            println("Não existe patinete colorido")
        } else {
            println("Seu produto de cor $cor foi adicionado à sacola\n")
        }
    }

    fun rodas() {
        println("Deseja levar o patinete com as rodas montadas?")
        var resp = readln()

        if (resp == completo) {
            println("OK. As rodas irão montadas")
        } else {
            println("As rodas irão separadas")
        }

    }


}
