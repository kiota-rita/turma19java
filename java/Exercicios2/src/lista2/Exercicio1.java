package lista2;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int numero1, numero2, numero3;
		
		System.out.println("Insira o primeiro n�mero: ");
		numero1 = leia.nextInt();
		System.out.println("Insira o segundo n�mero: ");
		numero2 = leia.nextInt();
		System.out.println("Insira o terceiro n�mero: ");
		numero3 = leia.nextInt();
		
		if (numero1 > numero2 && numero1>numero3) {
			System.out.println("O primeiro n�mero digitado � o maior: "+numero1);
		}
		else if (numero2 > numero1 && numero2>numero3) {
			System.out.println("O segundo n�mero digitado � o maior: "+numero2);
		}
		else if (numero3 > numero1 && numero3>numero2) {
			System.out.println("O terceiro n�mero digitado � o maior: "+numero3);
		}
		else {
			System.out.println("Voc� n�o digitou um n�mero inteiro, tente de novo");
		}

	}

}
