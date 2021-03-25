package Exercicios1;

import java.util.Scanner;
import java.lang.Math;

public class DistanciaPontos {
	/*inclua biblioteca Matematica
	
	funcao inicio()
	{
		real x1
		real x2
		real y1
		real y2
		real x
		real y
		real d

		escreva("Digite o valor de x1: ")
		leia(x1)
		escreva("Digite o valor de x2: ")
		leia(x2)
		escreva("Digite o valor de y1: ")
		leia(y1)
		escreva("Digite o valor de y2: ")
		leia(y2)

		x= (x2-x1)*(x2-x1)
		y= (y2-y1)*(y2-y1)
		d= (x+y)

		escreva("O valor de D é: ", Matematica.raiz(d,2))*/

	public static void main(String[] args) {

		Scanner leia = new Scanner (System.in);
		
		double x1;
		double x2;
		double y1;
		double y2;
		double x;
		double y;
		double d;
		double resultado;
		
		System.out.println("Digite o valor de x1: ");
		x1 = leia.nextDouble();
		System.out.println("Digite o valor de x2: ");
		x2 = leia.nextDouble();
		System.out.println("Digite o valor de y1: ");
		y1 = leia.nextDouble();
		System.out.println("Digite o valor de y2: ");
		y2 = leia.nextDouble();
		
		x = (x2-x1)*(x2-x1);
		y = (y2-y1)*(y2-y1);
		d= x+y;
		
		resultado = Math.sqrt(d);
		
		System.out.printf("A raíz quadrada dor valores informados é: %.2f",resultado);
				
	}

}
