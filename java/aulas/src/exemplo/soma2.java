package exemplo;

public class soma2 {
	
	public static void main (String[] args) { // indica que este � o programa principal
		
		//variaveis
		int valor1; //int valor1 = 0; � bom inicializar a variavel no inicio mas nao obrigatorio
		int valor2; //tipo e nome
		int soma;
		
		//entrada
		valor1=10;
		valor2 =20;
		
		//processamento
		soma=valor1+valor2;
		
		//saida
		System.out.println("O valor 1 �: "+valor1); //printa na tela e pula linha
		System.out.println("O valor 2 �: "+valor2);
		System.out.println("O valor da soma �: "+soma);
	}

}
