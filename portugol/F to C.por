programa {

inclua biblioteca Matematica
	
	funcao inicio () {
		
	cadeia nome
	real grauF
	real temperaturaHoje
	
	escreva("Digite o seu nome: ")
	leia(nome)
	escreva("Insira a temperatura em Fahrenheit aqui: ")
	leia(grauF)

	temperaturaHoje = (grauF-32)/1.8

	escreva("Hi, ",nome, " the temperature is: ", Matematica.arredondar(temperaturaHoje, 00)," C")
	
	}	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 365; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */