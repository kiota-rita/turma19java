package entity;

public class Revista extends Produto { //Revista herda Produto
	
	private String editora;

	//construtor
	public Revista(String descricao, String codigo, double valorUnitario, String editora) {
		super(descricao, codigo, valorUnitario);//super - é classe mãe
		this.editora = editora;
	}
	//encapsulamento- get and set
	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}
	
}
