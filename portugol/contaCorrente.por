programa
{
	
	funcao inicio()
	{
		inteiro numero
		cadeia cpf
		real saldoCorrente 
		inteiro contadorTalao
		inteiro pedirTalao

		se (tipoConta == 2) {

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
			escreva("\nSaldo Atual: R$" + saldo + "\n")

			para (inteiro x = 0; x < 10; x++) {

				escreva("\nPor favor, insira a operação desejada:\n[Débito] / [Crédito] ")
				leia(opcaoCorrente)

				se (opcaoCorrente == "Débito" ou opcaoCorrente == "débito" ou opcaoCorrente == "debito" 
				ou opcaoCorrente == "deb") {
					
					escreva("\nQuanto deseja retirar? R$")
					leia(debitoCorrente)

					se (debitoCorrente <= saldo) {
						saldo = saldo - debitoPoupanca
						escreva("\nO novo saldo é: R$" + saldo + ".\n")
					} senao {
						escreva("\nSaldo insuficiente.\n")
					}
				} senao se (opcaoCorrente == "Crédito" ou opcaoCorrente == "crédito" ou opcaoCorrente == "credito" 
				ou opcaoCorrente == "cred") {
					escreva("Quanto deseja adquirir? R$")
					leia(creditoPoupanca)

					saldo = saldo + creditoPoupanca
				} senao {
					escreva("\nPor favor, insira uma opção válida.\n")
				}
			} 

		escreva("Deseja solicitar um cheque? Digite 1 para Sim ou 2 para Não: ")
		leia(pedirTalao)

		se (pedirTalao == 1){
		    escreva("Quantos você deseja? Lembrando que seu limite é de 3 talões")
		    leia(contadorTalao)
		    para(real x = 0; x <3; x++){
		    		se(contadorTalao >= pedirTalao){
		    			contadorTalao = contadorTalao - pedirTalao
		    			escreva("Talão liberado, você tem direito a: ", contadorTalao, "talões")
		    		}
			    		senao {
			    			ecreva("Você não tem limite de talões")
			    		}  
		    	}
		}
		senao {
		escreva("Obrigado, volte sempre")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1855; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */