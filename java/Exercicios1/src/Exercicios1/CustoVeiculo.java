package Exercicios1;

import java.util.Scanner;

public class CustoVeiculo {
	/*	real custoFabri
		real distribuidor = 0.28
		real impostos = 0.45

		escreva("Digite o custo de fábrica: ")
		leia(custoFabri)

		escreva("O preço do veículo é:R$ ", (custoFabri*distribuidor)+(custoFabri*impostos) + custoFabri)*/
	     
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double custoFabri;
		double distribuidor = 0.28;
		double impostos = 0.45;
		
		System.out.println("Digite o custo de fábrica do veículo: ");
		custoFabri = leia.nextDouble();
		
		System.out.println("O custo total de veículo é: "+((custoFabri*distribuidor+custoFabri*impostos)+custoFabri)+" R$");
		
		
	}
}

