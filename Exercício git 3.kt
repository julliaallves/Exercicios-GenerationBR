fun main() {


    /* Informar todos os números de 1000 a 1999 que quando divididos por 11
obtemos resto = 5.
     */

    for (num in 1000..1999) {

        if (num % 11 == 5)
            println(num)

    }


/* Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99.
 */

    var idade = 0
    var cont1 = 0
    var cont2 = 0


    while (idade != -99) {
        println("Digite sua idade: ")
        idade = readln().toInt()

        if (idade >= 0 && idade <= 21) {
            cont1 = cont1 + 1
        } else if (idade >= 50) {
            cont2++
        }

    }
    println("O programa possui $cont1 pessoas com até 21 anos")
    println("E também $cont2 pessoas com idade a partir de 50 anos")


/* Crie um programa que leia um número do teclado até que encontre um
número igual a zero. No final, mostre a soma dos números
digitados.
 */

    var soma = 0.0

    do {
        println("Digite um número: ")
        var num = readln().toInt()

        soma += num

    } while (num != 0)

    print("A soma dos números digitados é: $soma")

}