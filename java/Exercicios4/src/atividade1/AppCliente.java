package atividade1;

import java.util.Scanner;

public class AppCliente {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Cliente cliente = new Cliente ();
		
		//entradas
		System.out.println("Digite o nome do cliente: ");
		cliente.nome = leia.next();
		System.out.println("Digite o CPF do cliente: ");
		cliente.cpf = leia.nextDouble();
		System.out.println("Digite o genero do cliente: 1-Feminino / 2-Masculino / 3-Neutro");
		cliente.genero =leia.next().charAt(0);
		System.out.println("O pagamento do cliente está em dia?  1-Sim / 2-Não");
		cliente.pagamento = leia.nextInt();
		
		//saidas
		System.out.println("----------------------------------------");
		System.out.printf("\nCliente: %s", cliente.nome);
		System.out.printf("\nCPF: %f", cliente.cpf);
		System.out.printf("\nGenero: %s", cliente.tipoGenero());
		System.out.printf("\nStatus do cadastro: %s", cliente.statusCadastro());


	}

}
