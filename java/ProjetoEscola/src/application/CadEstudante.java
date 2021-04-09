package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Basico;
import entities.Medio;

public class CadEstudante {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);	
		
		int opcao;
		/*10 MOVIMENTOS - inclus�o e exclus�o de notas
		media zero � possivel
		nenhuma m�dia pode ficar negativa ap�s os 10 movimentos possiveis
		a escola  dever ter um nome + G[NUMERO GRUPO]
		A escola dever ter um Slogan [exemplo Escola ED++, um plus de ensino em sua vida]
		Minimo do aluno � matricula, cpf - prote��o total - nota pode ser vista mais s� pode ser alterada por metodo. CPF/MATRICULA s� podem ser vistos.
		TELA INICIAL*/
		
		//Menu
		do {
		System.out.println("Nome escola");
		System.out.println("Eslogan");
		System.out.println();
		System.out.println("1- Basico\r\n"+ "2-M�dio\r\n"+ "3-Gradua��o\r\n"+ "4-P�s\r\n"+ "5-Mestrado\r\n"+ "6-Sair");
		System.out.println("Digite a op��o desejada");
		opcao = leia.nextInt();
			
			if(opcao ==1) {
				System.out.println("Digite a matricula do aluno: ");
				int matricula = leia.nextInt();
				System.out.println("Digite o CPF do aluno: ");
				String cpf = leia.next();
				System.out.println("Digite o dia de aniversario do aluno: ");
				int diaAniversario = leia.nextInt();
				
				Basico aluno = new Basico (cpf,matricula,diaAniversario);
				
				System.out.println("Digite a nota: ");
				double nota = leia.nextDouble();
				aluno.adicionarNota(nota);
					
					if(aluno.getPontos()<=5) {
						System.out.println("ainda n�o");
					}else {
						System.out.println("Parab�ns!!!");
					}
					System.out.println("Qual � o dia de hoje? ");
					int diaAtual = leia.nextInt();
					aluno.bonusAniversario(diaAtual); //metodo da classe basico
					System.out.println("Continua 1- sim ou 6-n�o? ");
					opcao = leia.nextInt();
				}//final op��o1
			
			else if(opcao ==2) {//inicio opcao2
				System.out.println("Digite a matricula do aluno: ");
				int matricula = leia.nextInt();
				System.out.println("Digite o CPF do aluno: ");
				String cpf = leia.next();
				
				Medio aluno = new Medio (cpf,matricula);
				
				System.out.println("Digite a nota: ");
				double nota = leia.nextDouble();
				aluno.adicionarNota(nota);
					
					if(aluno.getPontos()<=5) {
						System.out.println("ainda n�o");
					}else {
						System.out.println("Parab�ns!!!");
					}
					
					aluno.imprimirBoletim(); //metodo da classe basico
					System.out.println("Continua 2- sim ou 6-n�o? ");
					opcao = leia.nextInt();
				}//final opcao2
			
		}while (opcao != 6);
		
		System.out.println("Fim de programa");
		
	}

}
