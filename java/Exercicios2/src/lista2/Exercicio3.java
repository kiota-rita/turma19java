package lista2;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
			Scanner leia = new Scanner(System.in);
			
			int idade = 0;
			
			System.out.println("Qual � a sua idade? ");
			idade = leia.nextInt();
			
			if((idade == 10) || (idade<=14)) {
				System.out.println("Voc� est� na categoria infantil");
			}
			else if((idade == 15) || (idade<=17)) {
				System.out.println("Voc� est� na categoria juvenil");
			}
			else if((idade == 18) || (idade <=25)) {
				System.out.println("Voc� est� na categoria adulto");
			}
			else {
				System.out.println("Voc� n�o digitou uma idade entre 10 a 25 anos, tente novamente");
			}

	}

}
