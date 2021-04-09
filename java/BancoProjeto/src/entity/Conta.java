package entity;

public class Conta {
	
	private double numero;//atributo
	private String cpf;
	private double saldo; //saldo não pode mais ser visto pelo programa, não pode ser alterado no programa principal
	public boolean ativa;
	
	//public Conta (int numero, int cpf);
	//this numero = numero;
	
	//encapsulamento
	
	public double getNumero() {
		return numero;
	}

	/*public void setNumero(double numero) {
		this.numero = numero;
	}*/

	public String getCpf() {
		return cpf;
	}

	/*public void setCpf(String cpf) {
		this.cpf = cpf;
	}*/

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	//metodo
	
	public void debito(double valor) {//entra um input do user
		saldo= saldo-valor;
	}

	public void credito(double valor) {
		saldo = saldo+valor;
	}
	
	public String addCpf(String cpfNovo) {
		return cpf = cpfNovo;
	}
	
	public double addNumero(double numeroNovo) {
		return numero = numeroNovo;
	}
}
