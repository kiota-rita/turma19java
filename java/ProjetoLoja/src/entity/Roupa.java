package entity;

public class Roupa extends Produto{ //Roupa herda Produto
	
	private String marca;

	//construtor
	public Roupa(String descricao, String codigo, double valorUnitario, String marca) {
		super(descricao, codigo, valorUnitario);
		this.marca = marca;
	}
	
	//encapsulamento - get and set
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
}
