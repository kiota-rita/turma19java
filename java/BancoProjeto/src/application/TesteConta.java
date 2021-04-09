package application;

import java.util.Locale;
import java.util.Scanner;

import entity.Conta;

public class TesteConta {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		Conta user = new Conta();
		
		//entrada
		System.out.println("Digite o número da conta: ");
		double numeroNovo = leia.nextInt();
		user.addNumero(numeroNovo);
		System.out.println("Digite o seu CPF: ");
		String cpfNovo = leia.next();
		user.addCpf(cpfNovo);
		System.out.println("Digite o valor R$: ");
		double valor = leia.nextDouble();
		System.out.println("Operação de 1- Crédito / 2- Débito)");
		char opcao = leia.next().charAt(0);
		
		if(opcao =='1') {
			user.credito(valor);
		}
		else if(opcao =='2') {
			user.debito(valor);
		}
		//saida
		System.out.printf("CPF cliente: %s", user.getCpf());
		System.out.printf("\nNúmero da conta: %.2f",user.getNumero());
		System.out.printf("\nSaldo: %.2f",user.getSaldo());
	}
	

}
