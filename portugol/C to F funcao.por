programa
{
	funcao inicio()
	{

	real temperaturaC 
	cadeia nome
	
	

	escreva("digite seu nome ")
	leia (nome)
	escreva("digite a temperatura em Celcius ")
	leia (temperaturaC)

	escreva("Olá ",nome," a temperatura em Fahrenheit é de ",(conversao(temperaturaC)))
	
	}

	funcao real conversao (real tempC){
		  real conversao =  (tempC*1.8+32)

		retorne conversao
	}

}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 367; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */