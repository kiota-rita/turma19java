programa
{
	
	funcao inicio()
	{
		real base
		real altura
		real area

		escreva("Insira o valor referente a base do triangulo: ")
		leia(base)
		escreva("Insira o valor referente a altura do triangulo: ")
		leia(altura)

		se(base >0 e altura>0){
			area=(base*altura/2)
			escreva("A area do triangulo é: ",area)
		}
		senao se(base <=0 e altura<=0){
			escreva("Tente novamente com um valor positivo e maior que zero")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 438; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */