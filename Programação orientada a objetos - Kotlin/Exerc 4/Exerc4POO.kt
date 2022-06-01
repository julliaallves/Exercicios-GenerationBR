package Exerc4POO

fun main() {

/*
1- a) Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e
comportamentos (observe a tabela), utilize os seus conhecimentos e distribua
as características de forma que tudo o que for comum a todos os animais fique na classe Animal:

Cachorro:
Possui nome
Possui idade
Deve emitir som
Deve correr

Cavalo:
Possui nome
Possui idade
Deve emitir som
Deve correr

Preguiça:
Possui nome
Possui idade
Deve emitir som
Deve subir em árvores

1- b) Implemente um programa que crie os 3 tipos de animais definidos no exercício anterior e invoque
o método que emite o som de cada um de forma polimórfica, isto é, independente do tipo de animal.
 */

    val sons = Animal("", 0, "")
    val cachorro = Cachorro("", 0, "", true)
    val cavalo = Cavalo("", 0, "", true)
    val preguiça = Preguiça("", 0, "", true)

    cachorro.som()

    cavalo.som()

    preguiça.som()


}