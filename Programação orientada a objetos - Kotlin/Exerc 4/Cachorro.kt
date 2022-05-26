package Exerc4POO

class Cachorro(
    nome: String,
    idade: Int,
    som: String,
    var correr: Boolean
) : Animal(nome, idade, som) {


    override fun som() {
        super.som()
        println("de cachorro: au au auuuuuu")
    }
}


