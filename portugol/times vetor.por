programa
{
	
	funcao inicio()
	{
		cadeia times[4] //tamanho
		inteiro pontos[4]
		caracter resultado //g- Ganhou p- Perdeu e- Empatou

		times[0]="Palmeiras"//posição
		times[1]="Santos"//posição
		times[2]="São Paulo"//posição
		times[3]="Corinthians"//posição

		para( inteiro y=0; y<4; y++){
			escreva("O ", times[y], " digite g- Ganhou, p- Perdeu ou e- Empatou: ")
			leia(resultado) //times[y] roda as posições de times de 0 a 4
			se (resultado == 'g' ou resultado == 'G'){
				pontos[y] =3 //pontos[y] (aqui roda as posições de 0 a 4) recebe 3 pontos
			}
			senao se (resultado == 'e' ou resultado == 'E'){
				pontos[y] =1 
			}
			senao se (resultado == 'p' ou resultado == 'P'){
				pontos[y] =0 
			}
		}
		escreva("\nResultados\n")
		para(inteiro x=0; x<4; x++){
		escreva(times[x], " pontos: ",pontos[x],"\n")// times[x] e pontos[x] roda as posições de 0 a 4
		}		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 440; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */