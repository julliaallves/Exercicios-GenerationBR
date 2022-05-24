import Exerc1e2POO.Cliente

fun main() {

    /* Crie uma classe cliente e apresente os atributos e métodos referentes
    esta classe, em seguida crie um objeto cliente, defina as instancias deste
    objeto e apresente as informações deste objeto no console.
    */

    //objeto
    val pessoa = Cliente(
        "Lua",
        1,
        0.50,
        10.0,
        "Loiro",
        "Azuis"
    )

    pessoa.cantar()

    pessoa.atuar()

    pessoa.cantarEatuar()

}