package CadastroLoja;


import java.util.Scanner;

import Objetos.Pessoa;

public class CadastroLoja {
	
	public static void main(String[] args) {
		
	Scanner leia = new Scanner(System.in);
	
	Pessoa cliente1 = new Pessoa(); //instanciar a classe pessoa e criando o objeto Funcionario1
	Pessoa cliente2 = new Pessoa();
	
	//cliente1
	System.out.println("Digite o nome do cliente 1: ");
	cliente1.nome = leia.next(); //funcionario1 herda os atributos da classe Pessoa
	System.out.println("Digite o ano de nascimento do funcionario 1: ");
	cliente1.anoNascimento = leia.nextInt();
	System.out.println("Digite o genero do funcionario 1:");
	cliente1.genero =leia.next().charAt(0);
	
	//cliente2
	System.out.println("Digite o nome do cliente 2: ");
	cliente2.nome = leia.next();
	System.out.println("Digite o ano de nascimento do funcionario : ");
	cliente2.anoNascimento = leia.nextInt();
	System.out.println("Digite o genero do funcionario 2:");
	cliente2.genero =leia.next().charAt(0);
	
	//saidas
	System.out.println("A idade da pessoa 1 é: "+cliente1.calculaIdade());
	System.out.println("A idade da pessoa 2 é: "+cliente2.calculaIdade());
	
	if(cliente1.calculaIdade() > cliente2.calculaIdade()) {
		System.out.printf("%s %s %s pessoa 1 é mais velha",cliente1.artigo(), cliente1.tratamento(), cliente1.nome);
	}
	else {
		System.out.printf("%s %s %S pessoa 2 é mais velha",cliente2.artigo(), cliente2.tratamento(), cliente2.nome);
	}
		
	}
}
