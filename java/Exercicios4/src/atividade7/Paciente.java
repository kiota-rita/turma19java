package atividade7;

public class Paciente {
	public String nome;
	public int anoNascimento;
	public char genero; //1 feminino , 2 masculino , 3 neutro
	public double peso;
	public double altura;
	public int sintoma;
	
	//metodos
	
	public int calculaIdade() {
		return 2021 - anoNascimento;
	}
	
	public String tipoGenero() {
		String saida = null;  //sempre inicializar com null
		if(genero == '1') {
			saida = "Feminino";
		}
		else if(genero == '2') {
			saida = "Masculino.";
		}
		else if(genero == '3') {
			saida = "Neutro";
		}
		return saida;
	}
	
	public String urgencia() {
		String saida1 = null;  //sempre inicializar com null
		if(sintoma == 1) {
			saida1 = "Atendimento urgente";
		}
		else if(sintoma == 2) {
			saida1 = "Atendimento normal";
		}
		return saida1;
	}
}



