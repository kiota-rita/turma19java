package Exercicios1;

import java.util.Scanner;

public class MediaPonderada {

	public static void main(String[] args) {
		/*real nota1
		real nota2
		real nota3

		escreva("Digite a nota 1: ")
		leia(nota1)
		escreva("Digite a nota 2: ")
		leia(nota2)
		escreva("Digite a nota 3: ")
		leia(nota3)

		escreva("Sua média final é: ", (nota1/2)+(nota2/3)+(nota3/5)) (ESSA FORMULA ESTAVA ERRADA/ PROGRAMA EM JAVA COM FORMULA CORRETA ABAIXO*/
		
		Scanner leia = new Scanner (System.in);
		
		double nota1;
		double nota2;
		double nota3;
		double media;
		
		System.out.println("Digite a nota 1: ");
		nota1 = leia.nextDouble();
		System.out.println("Digite a nota 2: ");
		nota2 = leia.nextDouble();
		System.out.println("Digite a nota 3: ");
		nota3 = leia.nextDouble();
		
		media = ((2*nota1) + (3*nota2) + (5*nota3))/10;
		
		System.out.printf("sua média final é %.2f: ",media);	

	}

}
