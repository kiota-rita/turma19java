programa
 {
	
	inclua biblioteca Util --> U
	
	funcao inicio()
 {
		
		
	inteiro tipoConta
		cadeia cpf
		real saldo = 1000
		cadeia opcaoPoupanca
		real debitoPoupanca
		real creditoPoupanca

		faca {
		estilo()
		escreva("\n")
		escreva("\n            •AgiotaBank G7®• \n")
		estilo()
		escreva("\n")

		estilo()
		escreva("\n")
		escreva("\n     Aqui,você não fica nos devendo...\n")
		estilo()
		escreva("\n")
		escreva("\n")

		
		escreva("        [Carregando sistema...] \n")
		escreva("        ")
		
		para (inteiro x = 0; x < 23; x++) {

			escreva("█")	
			U.aguarde(200)
		}

		escreva("\n")
		escreva("\n         [Sistema carregado].")
		U.aguarde(2000)
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
		escreva("1 - Conta Poupança\n2 - Conta Corrente\n3 - Conta Especial\n4 - Conta Empresa\n5 - Conta Estudantil" +
		"\n6 - Sair\n\nDigite o código da opção selecionada: ")
		leia(tipoConta)
		
		se (tipoConta < 1 ou tipoConta > 6) {
			
			escreva("Por favor, insira um valor válido para o tipo de conta.")
				
		} senao se (tipoConta == 1) {

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
			
			contaPoupanca(saldo)
			
		} senao se (tipoConta == 2) {
			contaCorrente(saldo)
		} senao se (tipoConta == 3) {
			contaEspecial(saldo)
		} senao se (tipoConta == 4) {
			contaEmpresa(saldo)
		} senao se (tipoConta == 5) {
			contaEstudantil(saldo)
		} senao {
			
			escreva("Obrigado por escolher o AgiotaBank® e volte sempre!")
				
		}
	} enquanto(tipoConta != 6)
	}

	funcao contaPoupanca(real saldo) {
		escreva("•CONTA POUPANÇA | [Digite (sair) para voltar ao menu]\n")
			escreva("\nSaldo Atual: R$" + saldo + "\n")

			para (inteiro x = 0; x < 10; x++) {

				cadeia opcaoPoupanca
				cadeia opcaoCorrente
				real debitoPoupanca
				real creditoPoupanca


				
				escreva("\nPor favor, insira a operação desejada:\n[Débito] / [Crédito] ")
				leia(opcaoPoupanca)

				se (opcaoPoupanca == "Débito" ou opcaoPoupanca == "débito" ou opcaoPoupanca == "debito" 
				ou opcaoPoupanca == "deb") {
					
					escreva("\nQuanto deseja retirar? R$")
					leia(debitoPoupanca)

					se (debitoPoupanca <= saldo) {
						saldo = debito(saldo, debitoPoupanca)
						escreva("\nO novo saldo é: R$" + saldo + ".\n")
					} senao {
						escreva("\nSaldo insuficiente.\n")
					}
				} senao se (opcaoPoupanca == "Crédito" ou opcaoPoupanca == "crédito" ou opcaoPoupanca == "credito" 
				ou opcaoPoupanca == "cred") {
					escreva("Quanto deseja adquirir? R$")
					leia(creditoPoupanca)

					saldo = credito(saldo, creditoPoupanca)
				} 
				senao se (opcaoPoupanca == "Sair" ou opcaoPoupanca == "sair") {
					escreva("Voltando ao menu...")
					U.aguarde(2000)
					pare
					}
				senao {
					escreva("\nPor favor, insira uma opção válida.\n")
				}
			} 

			cadeia diaAniversarioPoupanca = "20"
			cadeia valorDiaAniversarioPoupanca
			escreva("\nPor favor, insira o dia de aniversário de sua conta: ")
			leia(valorDiaAniversarioPoupanca)
			
			se (diaAniversarioPoupanca == valorDiaAniversarioPoupanca) {
				escreva("\nHoje é o aniversário de sua conta. O valor será corrigido em 0,05%.\n\nSeu novo saldo é: R$" +
				((saldo * 0.05) + saldo) + "\n")
			} senao {
				escreva("\nHoje não é o aniversário de sua conta.\n")
				escreva("\nVoltando ao menu...!\n")
				U.aguarde(3000)
				
			}
			
	 }

	funcao contaCorrente (real saldo) {
		cadeia opcaoCorrente
		real debitoCorrente
		real creditoCorrente 
		cadeia pedirTalao
		inteiro numeroTalao
		inteiro contadorTalao = 3

		limpa()
		escreva("•CONTA CORRENTE | [Digite (sair) para voltar ao menu]\n")
		para (inteiro y = 0; y < 10; y++) {

				escreva("\nPor favor, insira a operação desejada:\n[Débito] / [Crédito] ")
				leia(opcaoCorrente)

				se (opcaoCorrente == "deb" ou opcaoCorrente == "débito" ou opcaoCorrente == "Débito") {
					
					escreva("\nQuanto deseja retirar? R$")
					leia(debitoCorrente)

					se (debitoCorrente <= saldo) {
						saldo = debito(saldo, debitoCorrente)
						escreva("\nO novo saldo é: R$" , saldo , ".\n")
					} senao {
						escreva("\nSaldo insuficiente.\n")
					}
				} senao se (opcaoCorrente == "cred" ou opcaoCorrente == "crédito" ou  opcaoCorrente == "Crédito") {
					escreva("Quanto deseja adquirir? R$")
					leia(creditoCorrente)
					
					saldo = credito(saldo, creditoCorrente)
					escreva("\nO novo saldo é: R$" ,saldo, ".\n")

				} 
				
				senao se(opcaoCorrente == "sair" ou opcaoCorrente == "s" ou opcaoCorrente == "SIM") {
						escreva("Voltando ao menu...")
						U.aguarde(2000)
						pare
					}
				
				senao {
					escreva("\nPor favor, insira uma opção válida.\n")
				}
			}
			
			escreva("Deseja solicitar um cheque? Digite S para Sim ou N para Não: ")
			leia(pedirTalao)
	
			se (pedirTalao == "S" ou pedirTalao == "sim" ou pedirTalao == "s") {
			    
			    para (inteiro x = 0; x <=3; x++) {

					escreva("\nQuantos você deseja? Lembrando que seu limite é de 3 talões: ")
			   		leia(numeroTalao)
			    		
			    		se(numeroTalao <= contadorTalao){
			    			contadorTalao = contadorTalao - numeroTalao
			    			escreva("Talão liberado\n")
			    			escreva("Você tem direito a: ", contadorTalao, " talão(ões)")
			    		}senao {
				    			escreva("Você não tem limite de talões\n")
				    			U.aguarde(5000)
				    	}    		 
			    	}
			} senao {
				
			escreva("Obrigado, volte sempre")
			}
		}

	funcao contaEspecial(real saldo) {
		
		real limiteMax = 1000
		real pedidoEmprestimo
		real limiteEmprestimo = 1000
		real pedidoCredito = 0
		cadeia opcaoPoupanca
		real debitoPoupanca
		cadeia opcaoCred
		cadeia opcaoEmprestimo
		inteiro tipoConta
			
			para (inteiro x = 0; x < 10; x++) {

				escreva("•CONTA ESPECIAL | [Digite (sair) para voltar ao menu]\n")
				escreva("\nPor favor, insira a operação desejada:\n[Débito] / [Crédito] / [Sair]")
				leia(opcaoPoupanca)
				
				se (opcaoPoupanca == "Débito" ou opcaoPoupanca == "débito" ou opcaoPoupanca == "debito" 
				ou opcaoPoupanca == "deb") {
					
					escreva("\nQuanto deseja retirar? R$")
					leia(debitoPoupanca)

					se (debitoPoupanca <= saldo) {
						saldo = debito(saldo, debitoPoupanca)
						escreva("\nO novo saldo é: R$" + saldo + ".\n")
					} senao {
						escreva("\nSaldo insuficiente, deseja fazer um empréstimo? (S/N)\n")
						leia(opcaoEmprestimo)

						se(opcaoEmprestimo == "S" ou opcaoEmprestimo == "Sim" ou opcaoEmprestimo == "s") {
							escreva("Quanto você quer de empréstimo? [Limite R$", limiteEmprestimo, "]", " R$")
							leia(pedidoCredito)
							se(pedidoCredito > limiteEmprestimo) {
								escreva("Desculpe, seu limite não permite essa transação")
								}
							senao {
								limiteEmprestimo = limiteEmprestimo - pedidoCredito
								saldo = credito(saldo, pedidoCredito)

								escreva("Seu novo saldo é: R$", saldo, " e o novo limite é: R$", limiteEmprestimo)
								}
						
							
							}
					}
				} senao se(opcaoPoupanca == "Credito" ou opcaoPoupanca == "crédito" ou opcaoPoupanca == "credito" 
				ou opcaoPoupanca == "cred") {
					
					escreva("\nQuanto você deseja de crédito?? R$:")
					leia(pedidoCredito)

					saldo = credito(saldo, pedidoCredito)

					escreva("Seu saldo agora é: ", saldo)
				} senao se (opcaoPoupanca == "Sair" ou opcaoPoupanca == "sair") {
					escreva("Voltando ao menu...")
					U.aguarde(2000)
					pare
				}
			}
		}

	funcao contaEmpresa(real saldo) {
		real limiteMax = 10000.0
		real pedidoEmprestimo
		real limiteEmprestimo = 10000
		real pedidoCredito = 0
		cadeia opcaoPoupanca
		real debitoPoupanca
		cadeia opcaoCred
		cadeia opcaoEmprestimo
			
			para (inteiro x = 0; x < 10; x++) {

				escreva("•CONTA EMPRESA | [Digite (sair) para voltar ao menu]\n")
				escreva("\nPor favor, insira a operação desejada:\n[Débito] / [Crédito] ")
				leia(opcaoPoupanca)

				se (opcaoPoupanca == "Débito" ou opcaoPoupanca == "débito" ou opcaoPoupanca == "debito" 
				ou opcaoPoupanca == "deb") {
					
					escreva("\nQuanto deseja retirar? R$")
					leia(debitoPoupanca)

					se (debitoPoupanca <= saldo) {
						saldo = debito(saldo, debitoPoupanca)
						
						escreva("\nO novo saldo é: R$" + saldo + ".\n")
					} senao {
						escreva("\nSaldo insuficiente.\n")
					}
				}
				senao se(opcaoPoupanca == "Credito" ou opcaoPoupanca == "crédito" ou opcaoPoupanca == "credito" 
				ou opcaoPoupanca == "cred") {
					escreva("\nQuanto você deseja de crédito?? R$:")
					leia(pedidoCredito)
					
					saldo = credito(saldo, pedidoCredito)

					escreva("Seu saldo atual é R$", saldo)
					}

					senao se(opcaoPoupanca == "sair" ou opcaoPoupanca == "s" ou opcaoPoupanca == "SIM") {
						escreva("Voltando ao menu...")
						U.aguarde(2000)
						pare
					}

				escreva("\nDeseja fazer um empréstimo? Seu saldo atual é R$", saldo, "   [S/N]: ")
				leia(opcaoEmprestimo)

				se(opcaoEmprestimo == "S" ou opcaoEmprestimo == "s" ou opcaoEmprestimo == "sim") {
					escreva("Quanto você deseja de empréstimo? [limite atual R$", limiteEmprestimo, "]", " R$")
					leia(pedidoEmprestimo)

					se(pedidoEmprestimo > limiteEmprestimo) {
						escreva("Negado, seu limite não permite essa transação...")
						}
					senao {
						limiteEmprestimo = limiteEmprestimo - pedidoEmprestimo
						saldo = saldo + pedidoEmprestimo
						escreva("Parabéns, seu novo saldo é R$", saldo, " e o novo limite de empréstimo é R$", limiteEmprestimo)
						}
					
					}
			}
		}

	funcao contaEstudantil(real saldo) {
		real limiteMax = 5000.0
		real pedidoEmprestimo
		real limiteEmprestimo = 5000
		real pedidoCredito = 0
		cadeia opcaoPoupanca
		real debitoPoupanca
		cadeia opcaoCred
		cadeia opcaoEmprestimo
			
			para (inteiro x = 0; x < 10; x++) {

				escreva("•CONTA ESTUDANTIL| [Digite (sair) para voltar ao menu]\n")
				escreva("\nPor favor, insira a operação desejada:\n[Débito] / [Crédito] ")
				leia(opcaoPoupanca)

				se (opcaoPoupanca == "Débito" ou opcaoPoupanca == "débito" ou opcaoPoupanca == "debito" 
				ou opcaoPoupanca == "deb") {
					
					escreva("\nQuanto deseja retirar? R$")
					leia(debitoPoupanca)

					se (debitoPoupanca <= saldo) {
						saldo = debito(saldo, debitoPoupanca)
						escreva("\nO novo saldo é: R$" + saldo + ".\n")
					} senao {
						escreva("\nSaldo insuficiente.\n")
					}
				}
				senao se(opcaoPoupanca == "Credito" ou opcaoPoupanca == "crédito" ou opcaoPoupanca == "credito" 
				ou opcaoPoupanca == "cred") {
					escreva("\nQuanto você deseja de crédito?? R$:")
					leia(pedidoCredito)

					saldo = credito(saldo, pedidoCredito)

					escreva("Seu saldo agora é: ", saldo)
					}
				senao se(opcaoPoupanca == "sair" ou opcaoPoupanca == "s" ou opcaoPoupanca == "SIM") {
					escreva("Voltando ao menu...")
					U.aguarde(2000)
					pare
					}

				escreva("\nDeseja fazer um empréstimo? Seu saldo atual é R$", saldo, "   [S/N]: ")
				leia(opcaoEmprestimo)

				se(opcaoEmprestimo == "S" ou opcaoEmprestimo == "s" ou opcaoEmprestimo == "sim") {
					escreva("Quanto você deseja de empréstimo? [limite atual R$", limiteEmprestimo, "]", " R$")
					leia(pedidoEmprestimo)

					se(pedidoEmprestimo > limiteEmprestimo) {
						escreva("Negado, seu limite não permite essa transação...")
						}
					senao {
						limiteEmprestimo = limiteEmprestimo - pedidoEmprestimo
						saldo = saldo + pedidoEmprestimo
						escreva("Parabéns, seu novo saldo é R$", saldo, " e o novo limite de empréstimo é R$", limiteEmprestimo)
						}
					

					
					}
			}
		}

	funcao real debito(real saldo, real debitoPoupanca) {
		saldo = saldo - debitoPoupanca
		
		retorne saldo
		}
		
	funcao real credito(real saldo, real creditoPoupanca) {
		saldo = saldo + creditoPoupanca

		retorne saldo
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
 * @POSICAO-CURSOR = 146; 
 * @DOBRAMENTO-CODIGO = [84, 88, 158, 293, 359, 425, 431, 441, 445];
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */