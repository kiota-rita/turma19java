package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;
import entities.Terceiro;

public class Teste {
	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US);
	Scanner leia = new Scanner(System.in);	
	
	Funcionario func1 = new Funcionario("321654", "Joana", 5, 10);
	Terceiro func2 = new Terceiro("369852", "Lidia", 3, 10, 10);
	
	//func1
	System.out.println("Matricula: "+func1.getMatricula());
	System.out.println("Nome funcionario: "+func1.getNome());
	System.out.println("Salario: R$"+func1.salario());
	
	System.out.print("_________________");
	
	//func2
	System.out.println("\nMatricula: "+func2.getMatricula());
	System.out.println("Nome funcionario: "+func2.getNome());
	System.out.println("Salario: R$"+func2.salario());
	}
}
