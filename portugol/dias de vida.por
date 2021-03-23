programa
{
	
	funcao inicio()
	{
		inteiro anos = 365
		inteiro meses = 30
		inteiro dias
		inteiro dia

		escreva("Quantos dias vocês tem? ")
		leia(dias)

		escreva("Você tem ", dias/anos, " anos")
		escreva("\nVocê tem ", (dias%anos)/meses, " meses")
		escreva("\nVocê tem ", (dias%anos)%meses, " dias")	
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 320; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */