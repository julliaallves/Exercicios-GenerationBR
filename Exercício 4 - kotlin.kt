// calculadora

fun calculadorasoma(n1: Int, n2: Int): Int {
    val soma = n1 + n2
    return soma
}


fun calculadorasub(n3: Int, n4: Int): Int {
    val sub = n3 - n4
    return sub
}

fun calculadoradiv(n5: Int, n6: Int): Int {
    val div = n5 / n6
    return div
}

fun calculadoramult(n7: Int, n8: Int): Int {
    val mult = n7 * n8
    return mult
}

fun main() {

    var opcao = 0

    print("Digite 1 para somar, 2 para subtrair, 3 para dividir e 4 para multiplicar: ")
    opcao = readln().toInt()

    when (opcao) {
        1 -> {
            print("Para somar digite um número: ")
            val num1 = readln().toInt()

            print("Agora outro: ")
            val num2 = readln().toInt()

            println("O total de $num1 + $num2 é: ${calculadorasoma(num1, num2)}")
        }

        2 -> {
            print("Para subtrair digite um número: ")
            val num3 = readln().toInt()

            print("Agora outro: ")
            val num4 = readln().toInt()

            println("O total de $num3 - $num4 é: ${calculadorasub(num3, num4)}")
        }

        3 -> {
            print("Para dividir digite um número: ")
            val num5 = readln().toInt()

            print("Agora outro: ")
            val num6 = readln().toInt()

            println("O total de $num5 / $num6 é: ${calculadoradiv(num5, num6)}")
        }

        4 -> {
            print("Para multiplicar digite um número: ")
            val num7 = readln().toInt()

            print("Agora outro: ")
            val num8 = readln().toInt()

            println("O total de $num7 X $num8 é: ${calculadoramult(num7, num8)}")
        }
    }}