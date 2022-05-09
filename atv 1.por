programa
{
	
	funcao inicio()
	{

		
//Execício proposto: criar um assistente virtual que solicite dados


cadeia nome
inteiro idade
cadeia dia
cadeia horario
cadeia pagamento

escreva ("Olá, seja bem vindo(a). Sou a Jana, sua assistente virtual. Irei coletar seus dados para prosseguirmos com o agendamento online. \n",
"Qual o seu nome completo? ")
leia (nome)

escreva ("Jana - E qual a sua idade? ")
leia (idade)

escreva ("Jana - Legal! Qual dia dessa semana deseja agendar seu corte de cabelo? ")
leia (dia)

escreva ("Jana - Perfeito. E qual sua disponibilidade de horário entre 08:00h e 20:00h? ")
leia (horario)

escreva ("Jana - Por fim, qual o melhor meio de pagamento para você? ")
leia (pagamento)

escreva ("\n\n***Cadastro concluído com sucesso*** \n\n",
"Olá, ",nome, ". Computamos que você possui ",idade, " anos. Estamos ansiosos para te receber no nosso salão no dia ",dia, " no horário agendado: ",horario, ".\n",
"Não se esqueça que o seu meio de pagamento escolhido foi: ",pagamento, ".\n\n", 
"Esperamos que tenha uma boa experiência conosco!\n",
"Qualquer dúvida pode nos procurar em nossos canais de comunicação. Até lá!\n\n\n")

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 321; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */