package Entidade;

public class Produtos {
	private String nome;
	private double preco;
	private int quantidade;

	public Produtos() {
	}

//-----------------------------------------------	
	public Produtos(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

//-----------------------------------------------
	public Produtos(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

//-----------------------------------------------

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

//-----------------------------------------------
	public double total_valor() {
		return preco * quantidade;
	}
//-----------------------------------------------
	public void add_produto(int quantidade) {
		this.quantidade += quantidade;
	}
//-----------------------------------------------
	public void remover(int quantidade) {
		this.quantidade -= quantidade;
	}
//-----------------------------------------------
	public String toString() {
		return nome + " " + "= R$ " + String.format("%.3f", preco) + ", " + "Quantidade Em Estoque: " + quantidade + " "
				+ "Valor Total: R$ " + String.format("%.3f", total_valor());

	}
//-----------------------------------------------
}
