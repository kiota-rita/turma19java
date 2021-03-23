programa
{
	
	funcao inicio()
	{
		
			inteiro numeroTalao
			inteiro pedirTalao
			inteiro contadorTalao = 3
			
		escreva("Deseja solicitar um cheque? Digite 1 para Sim ou 2 para Não: ")
			leia(pedirTalao)
	
			se (pedirTalao == 1){
			    escreva("Quantos você deseja? Lembrando que seu limite é de 3 talões: ")
			    leia(numeroTalao)
			    
			    para (inteiro x = 3; x <=3; x++){
			    		se(numeroTalao <= contadorTalao){
			    			contadorTalao = contadorTalao - numeroTalao
			    			escreva("Talão liberado\n")
			    			escreva("Você tem direito a: ", contadorTalao, " talão(ões)")
			    		}senao {
				    			escreva("Você não tem limite de talões")
				    	}    		 
			    	}
			}senao {
			escreva("Obrigado, volte sempre")
			}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 356; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */