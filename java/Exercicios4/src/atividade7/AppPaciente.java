package atividade7;

import java.util.Locale;
import java.util.Scanner;

public class AppPaciente {
	
public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		Paciente paciente = new Paciente ();
		
		//entradas
		System.out.println("Digite o nome do paciente: ");
		paciente.nome = leia.next();
		System.out.println("Digite o ano de nascimento do paciente: ");
		paciente.anoNascimento = leia.nextInt();
		System.out.println("Digite o genero do paciente:");
		paciente.genero =leia.next().charAt(0);
		System.out.println("Digite o peso do paciente: ");
		paciente.peso = leia.nextDouble();
		System.out.println("Digite o altura do paciente: ");
		paciente.altura = leia.nextDouble();
		System.out.print("___________________________________________\n");
		System.out.println("O paciente apresenta febre? 1-Sim / 2-Não");
		paciente.sintoma = leia.nextInt();
			
		//saidas
		System.out.print("___________________________________________\n");
		System.out.print("Nome paciente:"+paciente.nome);
		System.out.printf("\nIdade: %s Genero: %s\n", paciente.calculaIdade(), paciente.tipoGenero());
		System.out.printf("Peso: %.2f  Altura: %.2f\n", paciente.peso, paciente.altura);
		System.out.printf(paciente.urgencia());

	}
}
