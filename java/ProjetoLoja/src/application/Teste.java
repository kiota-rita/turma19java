package application;

import java.util.Locale;
import java.util.Scanner;

import entity.Doces;
import entity.Produto;
import entity.Revista;
import entity.Roupa;

public class Teste {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner leia = new Scanner(System.in);
		
		Produto prod1 = new Produto("Camisa","XL001", 100.25);//inicializar construtor de produto
		Revista revista1 = new Revista("Claudia","RR002", 15.50,"Abril");//inicializar contrutor de revista
		Roupa roupa1 = new Roupa ("Calça", "CC003", 100.99, "Zara");
		Doces doce1 = new Doces ("Barra de chocolate", "Choco1", 5.99, "Mondelez");
		
		//prod1
		prod1.setValorUnitario(80);
		prod1.incluirEstoque(10);
		System.out.println("Estoque: "+prod1.getQtdeEstoque());
		System.out.println(prod1.getDescricao()+" R$: "+prod1.getValorUnitario());
		System.out.println("Custo total: "+prod1.getQtdeEstoque()*prod1.getValorUnitario());
		
		//revista1
		revista1.incluirEstoque(10);
		System.out.println(" ");
		System.out.println("Revista: "+revista1.getDescricao()+" | Quantidade: "+revista1.getQtdeEstoque());
		System.out.println("Editora: "+revista1.getEditora()+ "| Valor unitario: "+revista1.getValorUnitario());
	
		//roupa1
		roupa1.incluirEstoque(50);
		System.out.println(" ");
		System.out.println("Roupa: "+roupa1.getDescricao()+ " | Quantidade: "+roupa1.getQtdeEstoque());
		System.out.println("Marca: "+roupa1.getMarca()+ " | Preço unitario: "+roupa1.getValorUnitario());
		
		//doce1
		doce1.incluirEstoque(30);
		System.out.println(" ");
		System.out.println("Tipo doce: "+doce1.getDescricao()+ " | Quantidade: "+doce1.getQtdeEstoque());
		System.out.println("Fabricante: "+doce1.getFabricante()+ " | Preço unitario: "+doce1.getValorUnitario());
	}

}
