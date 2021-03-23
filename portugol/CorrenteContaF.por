programa
{
	
	funcao inicio()
	{
		inteiro tipoConta
		real debitoCorrente
		real creditoCorrente
		real saldoCorrente = 1000
		real opcaoCorrente
		inteiro numeroTalao
		inteiro pedirTalao
		inteiro contadorTalao = 3

		escreva("1 - Conta Poupança\n2 - Conta Corrente\n3 - Conta Especial\n4 - Conta Empresa\n5 - Conta Estudantil" +
		"\n6 - Sair\n\nDigite o código da opção selecionada: ")
		leia(tipoConta)

		se (tipoConta < 1 ou tipoConta > 6) {
			
			escreva("Por favor, insira um valor válido para o tipo de conta.")
				
		}

		senao se (tipoConta == 2) {

			limpa()
			estilo2()
			escreva("\n")
			escreva("•ABank G7®•")
			escreva("\n")
			estilo3()
			escreva("\n")
			escreva("Aqui,você não fica nos devendo...\n")
			estilo2()
			escreva("\n")
			escreva("\n")
			
			escreva("• CONTA CORRENTE \n")
			escreva("\nSaldo Atual: R$" + saldoCorrente + "\n")

			para (inteiro y = 0; y < 10; y++) {

				escreva("\nPor favor, insira a operação desejada:\n[Débito - 1] / [Crédito - 2] ")
				leia(opcaoCorrente)

				se (opcaoCorrente == 1) {
					
					escreva("\nQuanto deseja retirar? R$")
					leia(debitoCorrente)

					se (debitoCorrente <= saldoCorrente) {
						saldoCorrente = saldoCorrente - debitoCorrente
						escreva("\nO novo saldo é: R$" , saldoCorrente , ".\n")
					} senao {
						escreva("\nSaldo insuficiente.\n")
					}
				} senao se (opcaoCorrente == 2) {
					escreva("Quanto deseja depositar? R$")
					leia(creditoCorrente)
					saldoCorrente = saldoCorrente + creditoCorrente
					escreva("\nO novo saldo é: R$" ,saldoCorrente , ".\n")
				} senao {
					escreva("\nPor favor, insira uma opção válida.\n")
				}
			}
			
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
funcao estilo() {
	 	escreva("________________________________________")
	 }

	 funcao estilo2() {
	 	escreva("__________________________________")
	 }

	 funcao estilo3() {
	 	escreva("----------------------------------")
	 }
}


/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 734; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */