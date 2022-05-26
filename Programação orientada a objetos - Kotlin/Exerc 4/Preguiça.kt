package Exerc4POO

class Preguiça(
    nome: String,
    idade: Int,
    som: String,
    var subirArvore: Boolean
) : Animal(nome, idade, som) {


    override fun som() {
        super.som()
        println("de bicho preguiça: ZzzZ ZzZzz")
    }


}