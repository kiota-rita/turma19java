programa
{
/*Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e em seguida, exiba a soma dos 
valores dela e a soma dos valores da primeira diagonal, ou seja, diagonal principal.*/
	
	funcao inicio()
	{
		inteiro tabela[3][3]
		inteiro soma1 =0, somaD

		para(inteiro li=0; li<3; li++){
			para(inteiro co=0; co<3; co++){
			escreva("Digite o valor da linha: ", li+1, " e da coluna ", co+1, ": ")
		     leia(tabela[li][co])
		     soma1=soma1+tabela[li][co]
			}
		}
		escreva("A soma é: ", soma1, "\n")	

		somaD= tabela[0][0] + tabela[1][1] + tabela[2][2]
		escreva("A soma da diagonal principal é: ", somaD)
			
	}
}


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 534; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */