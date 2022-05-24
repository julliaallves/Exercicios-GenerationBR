import Exerc1e2POO.Patinete

fun main (){

    /* Crie uma classe patinete e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto patinete, defina as instancias deste
objeto e apresente as informações deste objeto no console.
     */

    val patinete = Patinete(
        2,
        true,
        true,
        "Neutro"
    )

    patinete.cor()

    patinete.rodas()

}
