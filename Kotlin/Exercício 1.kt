fun main () {

    // 1 - Faça um programa em que o usuário digite o diâmetro de um círculo e calcule a área e o perímetro dele


    print("Olá, qual seu nome? ")
    var nome = readln()

    println("Bem vindo(a) $nome, por favor digite o diâmetro do círculo que deseja calcular: ")
    var diametro = readln().toDouble()


    println("O perímetro dele é é: ${(2 * 3.14) * (diametro/2)}")






}