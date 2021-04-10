package entidades;

public abstract class ProdutoAbstrata {
	
	//atributos
	protected String descricao;
	protected String codigo;
	protected double valorUnitario;
	protected int qtdeEstoque;
	 
	//construtor	
	public ProdutoAbstrata(String descricao, String codigo, double valorUnitario, int qtdeEstoque) {
		super();
		this.descricao = descricao;
		this.codigo = codigo;
		this.valorUnitario = valorUnitario;
		this.qtdeEstoque = qtdeEstoque;
	}

	//get and set
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getCodigo() {
		return codigo;
	}

	/*public void setCodigo(String codigo) {
		this.codigo = codigo;
	}*/

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public int getQtdeEstoque() {
		return qtdeEstoque;
	}

	/*public void setQtdeEstoque(int qtdeEstoque) {
		this.qtdeEstoque = qtdeEstoque;
	}*/
	
	//metodo
	public void incluirEstoque(int valorIncluido){
		this.qtdeEstoque = this.qtdeEstoque + valorIncluido; //this.atributo = faz referencia ao atributo da classe
	}
	public void tirarEstoque(int valorExcluido) {
		if (this.qtdeEstoque >= valorExcluido) { //só tira do estoque se o valor em estoque for maior ou igual ao estoque a ser retirado
		this.qtdeEstoque = this.qtdeEstoque - valorExcluido;
		} else {
			System.out.println("Estoque indisponivel.");
		}
	}
}