package Exerc3POO

class Cliente(private var nome: String) {

    private var endereco = ""
    private var telefone = ""

    private val listaDeCompras = mutableListOf<String>()


    constructor(nome: String, endereco: String) : this(nome) {
        this.endereco = endereco
    }

    constructor(nome: String, endereco: String, telefone: String) : this(nome, endereco) {
        this.telefone = telefone
    }

    fun addCompras(compra: String) {
        if (compra != "") {
            listaDeCompras.add(compra)
            println("Item adicionado")
        } else {
            println("Item vazio")
        }
    }

    fun removeCompras(compra: String) {
        if (listaDeCompras.contains(compra)) {
            listaDeCompras.remove(compra)
            println("Item removido")
        } else {
            println("Item inexistente")
        }
    }

    fun listaCompras() {
        listaDeCompras.forEach {
            println(it)
        }
    }

    init {
        if (nome == "") {
            throw Exception("O nome está vazio")
        }
    }

}