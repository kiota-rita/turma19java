package Lista3;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		int numero;
		int somaNumero=0;

		do{
			System.out.println("Digite um numero inteiro: ");
			numero = leia.nextInt();
			
		    if(numero!=0){
		        somaNumero += numero; //ou soma=numero+1
		    }
		}while(numero > 0);

		System.out.println("A somas dos numeros inteiros sao: "+somaNumero);

	}

}
