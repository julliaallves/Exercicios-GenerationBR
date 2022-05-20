import java.lang.Math.sqrt
import kotlin.math.pow

fun main() {

// 1- Faça um programa que receba três inteiros e diga qual deles é o maior.

    print("Digite um número: ")
    val num1 = readln().toInt()

    print("Digite outro número: ")
    val num2 = readln().toInt()

    print("Digite só mais número: ")
    val num3 = readln().toInt()

    if (num1 > num2 && num1 > num3)
        println("$num1 é o maior entre os 3 números")
    else if (num2 > num1 && num2 > num3)
        println("$num2 é o maior entre os 3 números")
    else
        println("$num3 é o maior entre os 3 números")


    // 2- Faça um programa que entre com três números e coloque em ordem crescente.

    print("Digite um número: ")
    val num4 = readln().toInt()

    print("Digite outro número: ")
    val num5 = readln().toInt()

    print("Digite só mais número: ")
    val num6 = readln().toInt()

    val lista = listOf(num4, num5, num6)

    val ordem = lista.sorted()

    println(ordem)


// 3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra: 10-14 infantil 15-17 juvenil 18-25 adulto


    println("Olá! Para que consigamos separar a sala da dinâmica na faixa etária correta nós queremos saber. Qual a sua idade? ")
    val idade = readln().toInt()

    when (idade) {
        in 10..14 -> println("Você pertence à categoria infantil. Obrigado(a)!")
        in 15..17 -> println("Você pertence à categoria juvenil. Obrigado(a)!")
        in 18..25 -> println("Você pertence à categoria adulto. Obrigado(a)!")
        else -> println("Resposta inválida")
    }

/* 4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado.
 */

    print("Digite um número: ")
    val num = readln().toDouble()

    if (num % 2 == 0.0) {
        print("Esse número é par. E sua raíz é: ${sqrt(num)}")


    } else {
        println("Esse número é ímpar. Elevado ao quadrado fica: ${num.pow(2)}")

    }
}