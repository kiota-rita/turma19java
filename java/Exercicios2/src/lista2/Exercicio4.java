package lista2;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

		/*Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou
		ímpar. Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao 
		quadrado.*/

		public static void main(String[] args) {

				Locale.setDefault(Locale.US);
				Scanner leia = new Scanner(System.in);
				
				double numero, raiz, quad;
				
				System.out.print("Digite um número: ");
				numero = leia.nextDouble();
				
				if(numero%2 == 0) {
					System.out.print("Número é par\n");
					raiz = Math.sqrt(numero);
					System.out.printf("Raiz quadrada de %.2f é igual à %.2f", numero, raiz);
				}
				else if(numero%2 != 0) {
					System.out.print("Número é ímpar\n");
					quad = Math.pow(numero, 2);
					System.out.printf("%.2f ao quadrado é %.2f", numero, quad);
				}
	
		}

}
