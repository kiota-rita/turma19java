package entities;

public class Cachorro extends Animal{
	
	public String corre;

	//contrutor
	public Cachorro(String nome, int idade, String corre) {
		super(nome, idade);
		this.corre = corre;
	}
	
	//metodo
	public String Movimento() {
		return "Cachorro corre";
	}
	public String Som() {
		return"AuAu!!";
	}

}
