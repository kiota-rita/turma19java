package entity;

public class Produto {
	//atributos
	private String descricao;
	private String codigo;
	private double valorUnitario;
	private int qtdeEstoque;
	
	
	//contrutores
	public Produto(String descricao, String codigo, double valorUnitario) {//sempre aparece o nome da classe, construtor te obriga a dar valor quando o objeto é instanciado
		super();
		this.descricao = descricao;
		this.codigo = codigo;
		this.valorUnitario = valorUnitario;
	} //botão direito, source, generate constructor using fields

	
	//encapsulamento - get and set
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
		
	//metodos
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
