package entities;

public class Preguica extends Animal {
	
	public String sobreArvore;

	//construtor
	public Preguica(String nome, int idade, String sobreArvore) {
		super(nome, idade);
		this.sobreArvore = sobreArvore;
	}
	
	//metodo
	public String Movimento() {
		return "Pregui�a sobe em �rvores";		
	}
	public String Som() {
		return "zzZzzZzz...";
	}
}
