package Exerc4POO

class Cavalo(
    nome: String,
    idade: Int,
    som: String,
    var correr: Boolean
) : Animal(nome, idade, som) {


    override fun som() {
        super.som()
        println("de cavalo: pocotó pocotó pocotó")
    }
}