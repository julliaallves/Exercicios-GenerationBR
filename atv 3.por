programa
{
	
	funcao inicio()
	{

/*
 * 
 * 1) João, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. 
 * Toda vez que ele traz um peso de tomate maior que o estabelecido pelo regulamento do estado de São Paulo (50 quilos) 
 * deve pagar um multa de R$ 4,00 por quilo excedente. João precisa que você faça um sistema que leia a variável P (peso de tomates) 
 * e verifique se há excesso. Se houver, gravar na variável E (Excesso) e na variável M o valor da multa que João deverá pagar. 
 * 
 * 
 * P = peso do tomate 50kg
 * E = excesso
 * M = multa R$4,00 por kg
 * 
 */

real P
real M = 4.0
real E

escreva ("Qual o peso comprado? ")
leia (P)

se (P <= 50){
	escreva (P, " kg")
	escreva ("\nPeso aceito")
}

senao se (P>50){

	escreva("Peso ultrapassado de: ",P - 50, " kg")
	escreva ("\nVocê terá o acréscimo de: ", (P-50)*M, " reais")
	
	
	}
}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 616; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */