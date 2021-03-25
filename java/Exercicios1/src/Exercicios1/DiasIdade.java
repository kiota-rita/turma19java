package Exercicios1;

import java.util.Scanner;

public class DiasIdade {

	public static void main(String[] args) {
		/*	inteiro anos
		inteiro meses
		inteiro dias

		escreva("Quantos anos você tem? ")
		leia(anos)
		escreva("Quantos meses você tem? ")
		leia(meses)
		escreva("Quantos dias vocês tem? ")
		leia(dias)

		escreva("você tem ", (anos*365)+(meses*30)+dias, " dias de idade")*/

		Scanner leia = new Scanner(System.in);
		
		int anos;
		int meses;
		int dias;
		int totalDias;
		
		System.out.println("Quantos anos você tem? ");
		anos = leia.nextInt();
		System.out.println("Quantos meses você tem? ");
		meses = leia.nextInt();
		System.out.println("Quantos dias você tem? ");
		dias = leia.nextInt();
		
		totalDias = (anos*365)+(meses*30)+dias;
		
		System.out.println("O total de dias que você está vivo é: " +totalDias);
		
		
	}

}
