package Exerc3POO

fun main() {

    /* Crie uma Classe Cliente, contendo os atributos encapsulados, um construtor padrão e
    pelo menos mais duas opções de construtores conforme sua percepção, com os atributos:
    nome (String), endereço (String), telefone (String), listaDeCompras (mutableListOf<Strings>()).
    A classe precisará de métodos para adicionar, remover e listar os itens do atributo listaDeCompras.
    Crie um método para verificar o nome ao inicializar a classe e, caso esteja vazio, jogue uma exceção.
    Ao instanciar a classe cliente na função main(), não esquecer de colocar dentro de um bloco try catch.
     */
        println("Qual seu nome?")
        val nome = readln()

    try {
        val cliente = Cliente(nome)

        while (true) {
            println("Digite 1 para adicionar compras")
            println("Digite 2 para remover compras")
            println("Digite 3 para listar compras")

            val resp = readln().toInt()

            when (resp) {
                1 -> {
                    print("Digite o nome do item a ser adicionado:")
                    val compra = readln()
                    cliente.addCompras(compra)
                }

                2 -> {
                    println("Digite o nome do item a ser removido:")
                    val compra = readln()
                    cliente.removeCompras(compra)
                }
                3 -> {
                    println("Lista de compras:")
                    cliente.listaCompras()
                    }
            }
        }
    }
    catch(e: Exception) {
        println(e.message)
    }
}

