programa
{
	
	funcao inicio()
	{
	cadeia nome
	inteiro chefaFamilia
	
	escreva("Digite o seu nome: ")
	leia(nome)
	escreva("Você é chefa de familia? Responda com 1 para Sim ou 2 para Não: ")
	leia(chefaFamilia)

		se(chefaFamilia == 1){
			escreva("Você receberá R$1.200")
		}
		senao se (chefaFamilia == 2) {
			escreva("Você receberá R$600")
		}
		senao se (chefaFamilia != 1 ou chefaFamilia !=2){
			escreva("Por favor, ", nome, " tente novamente, 1 para Sim ou 2 para Nâo")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 473; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */