package exemplo;

import java.util.Scanner;

public class CelciusToF {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		double grauC;
		double temperaturaHoje;
		
		System.out.println("Digite a temperatura em Celcius: ");
		grauC = leia.nextDouble();
		
		temperaturaHoje= grauC*1.8+32;
		
		System.out.printf("A temperatura �: %.2f",temperaturaHoje," F");//est� � uma forma de trabalhar com , e %.2F arredonda o numero e mostra duas casas decimais
	
	}

}
