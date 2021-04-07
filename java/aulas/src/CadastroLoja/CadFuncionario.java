package CadastroLoja;

import java.util.Scanner;

import Objetos.Pessoa; //importando a classe pessoa

public class CadFuncionario {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		Pessoa funcionario1 = new Pessoa(); //instanciar a classe pessoa e criando o objeto Funcionario1
		Pessoa funcionario2 = new Pessoa();
		
		System.out.println("Digite o nome do funcionario 1: ");
		funcionario1.nome = leia.next(); //funcionario1 herda os atributos da classe Pessoa
		System.out.println("Digite o nome do funcionario 2: ");
		funcionario2.nome = leia.next();
		System.out.println("Digite o ano de nascimento do funcionario 1: ");
		funcionario1.anoNascimento = leia.nextInt();
		System.out.println("Digite o ano de nascimento do funcionario : ");
		funcionario2.anoNascimento = leia.nextInt();
		System.out.println("Digite o genero do funcionario 1:");
		funcionario1.genero =leia.next().charAt(0);
		System.out.println("Digite o genero do funcionario 2:");
		funcionario2.genero =leia.next().charAt(0);
		
		System.out.println("A idade da pessoa 1 é: "+funcionario1.calculaIdade());
		System.out.println("A idade da pessoa 2 é: "+funcionario2.calculaIdade());
		
		if(funcionario1.calculaIdade() > funcionario2.calculaIdade()) {
			System.out.printf("%s %s %s pessoa 1 é mais velha",funcionario1.artigo(), funcionario1.tratamento(), funcionario1.nome);
		}
		else {
			System.out.printf("%s %s %S pessoa 2 é mais velha",funcionario2.artigo(), funcionario2.tratamento(), funcionario2.nome);
		}
		
		
	}

}
