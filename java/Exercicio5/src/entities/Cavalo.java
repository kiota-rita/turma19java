package entities;

public class Cavalo extends Animal{
	
	public String deveCorrer;

	//construtor
	public Cavalo(String nome, int idade, String deveCorrer) {
		super(nome, idade);
		this.deveCorrer = deveCorrer;
	}
	
	//metodo
	public String Movimento() {
		return "Cavalo corre";
	}
	public String Som() {
		return "hiii in hii";
	}
}
