package Exercicios1;

import java.util.Scanner;

public class DiasIdade {

	public static void main(String[] args) {
		/*	inteiro anos
		inteiro meses
		inteiro dias

		escreva("Quantos anos voc� tem? ")
		leia(anos)
		escreva("Quantos meses voc� tem? ")
		leia(meses)
		escreva("Quantos dias voc�s tem? ")
		leia(dias)

		escreva("voc� tem ", (anos*365)+(meses*30)+dias, " dias de idade")*/

		Scanner leia = new Scanner(System.in);
		
		int anos;
		int meses;
		int dias;
		int totalDias;
		
		System.out.println("Quantos anos voc� tem? ");
		anos = leia.nextInt();
		System.out.println("Quantos meses voc� tem? ");
		meses = leia.nextInt();
		System.out.println("Quantos dias voc� tem? ");
		dias = leia.nextInt();
		
		totalDias = (anos*365)+(meses*30)+dias;
		
		System.out.println("O total de dias que voc� est� vivo �: " +totalDias);
		
		
	}

}
