fun main() {

    /* Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
trabalhar com Collection do tipo List do Kotlin para manipular os dados desse estoque, o
programa deverá atender as seguintes funcionalidades:
Armazenar dados da List
Remover dados da list;
Atualizar dados da list.
Apresentar todos os dados da list.
     */
    val lista = mutableListOf<String>()

    while (true) {
        println(
            "Digite:\n" +
                    "1 para adicionar itens\n" +
                    "2 para remover\n" +
                    "3 para editar\n" +
                    "4 para visualizar lista\n" +
                    "5 para encerrar"
        )
        val num = readln().toInt()

        when (num) {

            1 -> {
                do {
                    println("Digite o nome do item que deseja adicionar: ")
                    val nome = readln()

                    if (nome != "") {
                        lista.add(nome)

                    } else {
                        println("Operação inválida.")
                        println(lista)
                        break
                    }

                } while (nome != "")

            }


            2 -> {
                println("Digite o nome do item que deseja remover: ")
                val nome = readln()

                if (lista.contains(nome)) {
                    lista.remove(nome)
                    println(lista)

                } else {
                    println("O item $nome não existe na lista")
                }


            }

            3 -> {
                lista.forEach {
                    println(it)
                }

                println("Digite o nome que deseja editar: ")


                val nome = readln()

                if (lista.contains(nome)) {
                    val index = lista.indexOf(nome)
                    println("Digite o novo nome do item: ")
                    val nome = readln()
                    lista[index] = nome
                    println("O nome foi atualizado com sucesso!")
                } else {
                    println("O nome $nome não existe na lista")
                }
            }

            4 -> {
                println("Lista de itens: ")

                lista.forEach {
                    print("$it\n")
                }

                println()

            }
            5 -> {
                println("Solicitação encerrada")
                break
            }
        }
    }
}


