programa
{
		inclua biblioteca Matematica -->mat
	funcao inicio()
	
	{

// Fazer IMC


real peso, altura, imc

escreva ("Qual seu peso? ")
leia(peso)

escreva ("E sua altura? ")
leia(altura)

imc = peso / (altura * altura)
escreva ("Seu IMC é: ", mat.arredondar (imc,1))

se (imc < 18.5){
	escreva ("\nVocê está abaixo do peso")
	
}senao se (imc <= 24.9){
	escreva ("\nVocê está no peso")
	
}senao se (imc < 29.9){
escreva ("\nVocê está com excesso de peso")
	
}senao se (imc < 34.9){
escreva ("\nVocê está com obesidade 1")
	
}senao se (imc < 39.9){
escreva ("\nVocê está com obesidade 2")
	
}senao se (imc >= 40){
escreva ("\nVocê está com obesidade 3")


	}

	}}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 326; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */