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
		return "Preguiça sobe em árvores";		
	}
	public String Som() {
		return "zzZzzZzz...";
	}
}
