package entity;

public class Doces extends Produto {//Doces herda Produto
	
	private String fabricante;

	//construtor
	public Doces(String descricao, String codigo, double valorUnitario, String fabricante) {
		super(descricao, codigo, valorUnitario);
		this.fabricante = fabricante;
	}
	//encapsulamento - get and set

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}	
}
