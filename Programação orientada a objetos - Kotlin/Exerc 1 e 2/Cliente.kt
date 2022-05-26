package Exerc1e2POO

class Cliente(

    var nome: String,
    var idade: Int,
    var altura: Double,
    var peso: Double,
    var cordocabelo: String,
    var cordosolhos: String
) {

    var cantando = true
    var atuando = false

    //metodo - cantar, atuar

    fun cantar() {
        if (cantando) {
            println("O cliente está cantando")
        } else {
            cantando = false
            println("O cliente não canta")
        }
    }

    fun atuar() {
        if (cantando) {
            cantando = false
            println("O cliente está atuando")
        } else {
            println("O cliente só pode cantar e não atuar")
        }
    }

    fun cantarEatuar() {
        if (cantando || atuando) {
            println("O cliente está selecionado para a próxima fase pois canta e atua")
        } else {
            print("O cliente ainda será avaliado para a próxima fase")
        }

    }


}