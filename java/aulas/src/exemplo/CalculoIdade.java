package exemplo;

import java.util.Scanner; //classe de "teclado" para pegar os inputs do user

public class CalculoIdade {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in); //Objeto do tipo Scanner chamado leia comando leia para ler os inputs do user
		
		int valor1;
		int valor2;
		int soma;
		
		System.out.println("Digite o valor 1: ");
		valor1 = leia.nextInt(); //para ler o input: nome da variavel, nome do objeto+o metodo para ler o tipo da variavel, neste caso para ler inteiro
		System.out.println("Digite o valor 2: ");
		valor2 = leia.nextInt();
		
		soma= valor1+valor2; //calculo da soma
		
		System.out.println("A soma é: "+soma);
		
	}

}
