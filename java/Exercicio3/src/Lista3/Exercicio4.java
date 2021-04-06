package Lista3;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int idade;
		int genero;
		int opcao;
		int continua = 1;
		int contador= 1;
		int mulherNervosa =0;
		int pessoasCalmas = 0;
		int homensAgressivos = 0;
		int outrosCalmos = 0;
		int pessoasNervosas40 = 0;
		int pessoasCalmas18 = 0;
		final int LIMITE = 150;
		
		System.out.print("Você gostaria de responder a pesquisa? 1-Sim / 2-Não");
		continua = leia.nextInt();
		
		//inicio while
		
		while(continua == '1' && contador<=LIMITE) {
			System.out.print("Informe a sua idade: ");
			idade = leia.nextInt();
			System.out.print("Digite 1-Feminino / 2- Masculino/ 3- Outros");
			genero = leia.nextInt();
			System.out.print("1, calma; 2, nervosa e 3, agressiva\n");
			opcao = leia.nextInt();	
			if (contador!=LIMITE) {
				System.out.print("Você gostaria de responder a pesquisa? 1-Sim / 2-Não");
				continua = leia.nextInt();
			}
			//tipos de pessoas
			if (opcao == 1) {
				pessoasCalmas++;
			}
			if(genero ==1 && opcao ==2) {
				mulherNervosa++;
			}
			if(genero ==2 && opcao==3) {
				homensAgressivos++;
			}
			if(genero == 3 && opcao ==1) {
				outrosCalmos++;
			}
			if(opcao == 2 && idade>=40) {
				pessoasNervosas40++;
			}
			if(opcao == 1 && idade<18) {
				pessoasCalmas18++;
			}
			contador++; //contador vai rodar até atingir o limite estabelecido no inicio do while
		}//final while
		 
		//saidas
		System.out.print("pessoas calmas: "+pessoasCalmas);
		System.out.print("mulheres nervosas: "+mulherNervosa);
		System.out.print("homens agressivos: "+homensAgressivos);
		System.out.print("outros calmas: "+outrosCalmos);
		System.out.print("pessoas nervosas com mais de 40 anos: "+pessoasNervosas40);
		System.out.print("pessoas calmas menores de 18 anos: "+pessoasCalmas18);
		System.out.println("Fim de programa!");

	}

}
