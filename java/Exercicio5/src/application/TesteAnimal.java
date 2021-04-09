package application;

import java.util.Scanner;

import entities.Animal;
import entities.Cachorro;
import entities.Cavalo;
import entities.Preguica;

public class TesteAnimal {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Animal animal1 = new Animal(null, 0);
		Cachorro animal2 = new Cachorro("Lua", 12, "run");
		Cavalo animal3 = new Cavalo("Carlinhos",1,"run");
		Preguica animal4 = new Preguica("Marilyn", 30, "froze");

		System.out.print("Cachorro(a): " + animal2.nome + " tem " + animal2.idade + " ano(s).\n");
		System.out.println(animal2.Movimento() + " e faz " + animal2.Som());
		
		System.out.print("\nCavalo: " + animal3.nome + " tem " + animal3.idade + " ano(s).\n");
		System.out.println(animal3.Movimento() + " e faz " + animal3.Som());
		
		System.out.print("\nPreguica: " + animal4.nome + " tem " + animal4.idade + " ano(s).\n");
		System.out.println(animal4.Movimento() + " e faz " + animal4.Som());
	}

}
