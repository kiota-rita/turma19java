package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
//impor das classes
import entities.Funcionario;
import entities.Terceiro;

public class UserTest {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		List<Funcionario> lista = new ArrayList<>();//criar lista vetorizada
		
		System.out.print("CADASTRO DE PAGAMENTO DE FUNCIONARIOS");
		System.out.println("\n\nQuantos funcionarios serão cadastrados?");
		
		int quant = leia.nextInt();
		
		for (int x=1; x<=quant; x++) {
			System.out.printf("Funcionario: %d\n",x);
			System.out.println("Digite 1- Funcionario / 2- Terceiro");
			char tipo = leia.next().charAt(0);
			System.out.println("Digite a matricula: ");
			String matricula = leia.next();
			System.out.println("Digite o nome: ");
			String nome = leia.next();
			System.out.println("Digite as horas trabalhadas: ");
			int horasTrabalhadas = leia.nextInt();
			System.out.println("Digite salário por hora: ");
			double valorHora = leia.nextDouble();
				
				if(tipo == '2') {
					System.out.println("Digite o valor do adicional: ");
					double adicional = leia.nextDouble();
					lista.add(new Terceiro (nome, nome, horasTrabalhadas, adicional, adicional));//polimorfismo - terceiro é um tipo de funcionario - se adapta desde que as classes tenham relação
				}else {
					lista.add(new Funcionario (nome, nome, horasTrabalhadas, valorHora));
				}
		}//fim for
		
		System.out.println();
		System.out.println("FOLHA DE PAGAMENTO");
		for (Funcionario func:lista) {//for faz leitura da lista
			System.out.println(func.getNome()+" salario R$: "+func.salario());
		}//fim for each
		
		System.out.println("FIM DE PROGRAMA");
	}

}