package lista2;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

		/*Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este n�mero � par ou
		�mpar. Se for par exiba tamb�m a raiz quadrada do mesmo; se for �mpar exiba o n�mero elevado ao 
		quadrado.*/

		public static void main(String[] args) {

				Locale.setDefault(Locale.US);
				Scanner leia = new Scanner(System.in);
				
				double numero, raiz, quad;
				
				System.out.print("Digite um n�mero: ");
				numero = leia.nextDouble();
				
				if(numero%2 == 0) {
					System.out.print("N�mero � par\n");
					raiz = Math.sqrt(numero);
					System.out.printf("Raiz quadrada de %.2f � igual � %.2f", numero, raiz);
				}
				else if(numero%2 != 0) {
					System.out.print("N�mero � �mpar\n");
					quad = Math.pow(numero, 2);
					System.out.printf("%.2f ao quadrado � %.2f", numero, quad);
				}
	
		}

}
