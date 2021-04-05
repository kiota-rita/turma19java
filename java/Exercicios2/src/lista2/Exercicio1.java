package lista2;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero1, numero2, numero3;
		
		System.out.println("Insira o primeiro número: ");
		numero1 = leia.nextInt();
		System.out.println("Insira o segundo número: ");
		numero2 = leia.nextInt();
		System.out.println("Insira o terceiro número: ");
		numero3 = leia.nextInt();
		
		if (numero1 > numero2 && numero1>numero3) {
			System.out.println("O primeiro número digitado é o maior: "+numero1);
		}
		else if (numero2 > numero1 && numero2>numero3) {
			System.out.println("O segundo número digitado é o maior: "+numero2);
		}
		else if (numero3 > numero1 && numero3>numero2) {
			System.out.println("O terceiro número digitado é o maior: "+numero3);
		}
		else {
			System.out.println("Você não digitou um número inteiro, tente de novo");
		}

	}

}
