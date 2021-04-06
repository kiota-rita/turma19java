package Lista3;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		double numeros [] = new double [4];
		int par=0;
		int impar= 0; 
		
		for (int y=0; y<4;y++) {
			System.out.printf("Digite o número %d: ",y+1);
			numeros[y] = leia.nextDouble();
			if (numeros[y]%2==0){
			par= par+1;
			}
		} 
		
		impar =4-par;
		System.out.println("");
		System.out.println("Total de números pares: "+par);
		System.out.println("Total de números impares é: "+impar);
	}

}
