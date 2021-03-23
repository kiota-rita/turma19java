programa
{

     funcao inicio()
     {
          inteiro numero
          escreva("Digite um número inteiro positivo: ")
          leia(numero)
          se (numero == 0) {
               escreva("0 é um número neutro\n")
          }
          senao se(numero % 2 == 0){
          	escreva("O número é par\n")
          }
          senao {
               escreva("O número é impar")
          }
     }
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 119; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */