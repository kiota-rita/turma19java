programa {	

	funcao inicio()
	{
		real P
		real E
		real M 

		escreva("Insira o peso dos tomates em KG: ")
		leia(P)

		E = (P-50)
		M = E*4

			se(P>50){
			escreva("O peso exede o permitido!\n")
			escreva("O excesso é de: ", E, "e o valor da multa é de R$: ", M)
			}
	
			senao {
			escreva("O peso está dentro do permitido!\n")
			escreva("O excesso é de: 0,00 e o valor da multa é de R$: 0,00")
			}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 416; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */