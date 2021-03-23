programa
{
	
	funcao inicio()
	{
		//matriz posição Linha[L] e Coluna[C]
		cadeia agenda[24][31] //{24]numero linhas e [31]numero colunas
		inteiro dia, hora
		caracter opcao

		faca{
		escreva("Digite o dia do compromisso: ")
		leia(dia)
		dia -= 1 //ou dia=dia-1 (tira 1 para ajustar a posição)
		escreva("Digite a hora: ")
		leia(hora)
		escreva("Informe o compromisso: ")
		leia(agenda[hora][dia])
		escreva("Deseja continuar? S-sim ou N-Não: ")
		leia(opcao)
		se (opcao == 'N' ou opcao == 'n'){
			pare
			}
		} enquanto (verdadeiro)

		limpa()//limpa o console com as entradas da agenda

		para(inteiro d=0; d<31; d++){//giro do dia
			para(inteiro h=0; h<24; h++){//giro da hora
				se(agenda[h][d]  != ""){ //condição para mostrar apenas os dias preenchidos
				escreva("Agenda do dia ", d+1, " às ", h, " ", agenda[h][d],"\n")//exibe os compromissos
				}
			}
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 880; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */