package Objetos;

public class Pessoa { //classe
	
	//inicio
	
	//atributos
	public String nome;
	public int anoNascimento;
	public char genero; //1 feminino Sra, 2 masculino Sr, 3 outre Sre
	
	
	//metodo
	public int calculaIdade() {
		return 2021 - anoNascimento;
	}
	
	//sobrecarga do metodo calculaIdade - o mesmo metodo trabalha de forma diferente
	public int calcularIdade(int anoAtual) {
		return anoAtual - anoNascimento;
	}
	
	//metodo
	public String tratamento() {
		String saida = null;  //sempre inicializar com null
		if(genero == '1') {
			saida = "Sra.";
		}
		else if(genero == '2') {
			saida = "Sr.";
		}
		else if(genero == '3') {
			saida = "Sre.";
		}
		return saida;
	}
	
	public String artigo() {
		String saida = null; //sempre inicializar com null
		if(genero == '1') {
			saida = "A";
		}
		else if(genero == '2') {
			saida = "O";
		}
		else if(genero == '3') {
			saida = "E";
		}
		return saida;
	}
	
}

