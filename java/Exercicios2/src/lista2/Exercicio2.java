package lista2;

import java.util.Scanner;

public class Exercicio2 {
//Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero1, numero2, numero3; //
		
		System.out.println("Insira o primeiro n�mero: ");
		numero1 = leia.nextInt();
		System.out.println("Insira o segundo n�mero: ");
		numero2 = leia.nextInt();
		System.out.println("Insira o terceiro n�mero: ");
		numero3 = leia.nextInt();
		
		//PAR MAIOR NUMERO
				if(numero1 > numero2 && numero1 > numero3) {
					System.out.println(numero1);
				}
					else if(numero2 > numero1 && numero2 > numero3) {
						System.out.println(numero2);
					}
					else if(numero3 > numero1 && numero3 > numero2) {
						System.out.println(numero3);
					}
			//NUMERO MEIO
				if(numero1 < numero2 && numero1 > numero3) {
					System.out.println(numero1);
				}	
					else if(numero2 > numero1 && numero2 < numero3) {
						System.out.println(numero2);
					}
					else if(numero3 > numero1 && numero3 < numero2) {
						System.out.println(numero3);
					}
			//MENOR NUMERO
				if(numero1 < numero2 && numero1 < numero3) {
					System.out.print(numero1);
				}
					else if(numero2 < numero1 && numero2 < numero3) {
						System.out.println(numero2);
					}
					else if(numero3 < numero1 && numero3 < numero2) {
						System.out.println(numero3);
					}

	}

}
