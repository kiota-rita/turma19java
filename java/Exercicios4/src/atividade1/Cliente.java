package atividade1;

public class Cliente {
	
	public String nome;
	public double cpf;
	public char genero; //1 feminino , 2 masculino , 3 neutro
	public int pagamento;
	
	
	//metodos
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
	
	public String statusCadastro() { //situacao do cadastro
		String saida1 = null;  //sempre inicializar com null
		if(pagamento == 1) {
			saida1 = "Cadastro ativo";
		}
		else if(pagamento == 2) {
			saida1 = "Cadastro bloqueado";
		}
		return saida1;
	}
	

}
