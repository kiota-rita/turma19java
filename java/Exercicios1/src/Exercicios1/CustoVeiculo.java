package Exercicios1;

import java.util.Scanner;

public class CustoVeiculo {
	/*	real custoFabri
		real distribuidor = 0.28
		real impostos = 0.45

		escreva("Digite o custo de f�brica: ")
		leia(custoFabri)

		escreva("O pre�o do ve�culo �:R$ ", (custoFabri*distribuidor)+(custoFabri*impostos) + custoFabri)*/
	     
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double custoFabri;
		double distribuidor = 0.28;
		double impostos = 0.45;
		
		System.out.println("Digite o custo de f�brica do ve�culo: ");
		custoFabri = leia.nextDouble();
		
		System.out.println("O custo total de ve�culo �: "+((custoFabri*distribuidor+custoFabri*impostos)+custoFabri)+" R$");
		
		
	}
}

