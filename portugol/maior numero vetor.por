programa
{
	/*Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade e o escreva
	em seguida. Encontre após a maior pontuação e a apresente.*/
	funcao inicio()
	{
		inteiro pontos[5]
		inteiro maiorNumero =0
		
		para(inteiro y=0; y<5; y++){
			escreva("Digite a pontuação da atividade" ,y+1, ": ")
			leia(pontos[y])
			se(pontos[y] > maiorNumero){
				maiorNumero = pontos[y]
			}	
		}
		escreva("Maior valor é: " , maiorNumero)		
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 481; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */