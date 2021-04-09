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
		/*10 MOVIMENTOS - inclusão e exclusão de notas
		media zero é possivel
		nenhuma média pode ficar negativa após os 10 movimentos possiveis
		a escola  dever ter um nome + G[NUMERO GRUPO]
		A escola dever ter um Slogan [exemplo Escola ED++, um plus de ensino em sua vida]
		Minimo do aluno é matricula, cpf - proteção total - nota pode ser vista mais só pode ser alterada por metodo. CPF/MATRICULA só podem ser vistos.
		TELA INICIAL*/
		
		//Menu
		do {
		System.out.println("Nome escola");
		System.out.println("Eslogan");
		System.out.println();
		System.out.println("1- Basico\r\n"+ "2-Médio\r\n"+ "3-Graduação\r\n"+ "4-Pós\r\n"+ "5-Mestrado\r\n"+ "6-Sair");
		System.out.println("Digite a opção desejada");
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
						System.out.println("ainda não");
					}else {
						System.out.println("Parabéns!!!");
					}
					System.out.println("Qual é o dia de hoje? ");
					int diaAtual = leia.nextInt();
					aluno.bonusAniversario(diaAtual); //metodo da classe basico
					System.out.println("Continua 1- sim ou 6-não? ");
					opcao = leia.nextInt();
				}//final opção1
			
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
						System.out.println("ainda não");
					}else {
						System.out.println("Parabéns!!!");
					}
					
					aluno.imprimirBoletim(); //metodo da classe basico
					System.out.println("Continua 2- sim ou 6-não? ");
					opcao = leia.nextInt();
				}//final opcao2
			
		}while (opcao != 6);
		
		System.out.println("Fim de programa");
		
	}

}
