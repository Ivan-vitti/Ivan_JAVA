package Entidade;

public class Produtos {
	public String nome;
	public double preco;
	public int quantidade;

	public double total_valor() {
		return preco * quantidade;
	}

	public void add_produto(int quantidade) {
		this.quantidade += quantidade;
	}

	public void remover(int quantidade) {
		this.quantidade -= quantidade;
	}
	public String toString() {
		return nome
			+ ", R$ "
			+ String.format("%.3f", preco)
			+ ", "
			+ "Quantidade Em Estoque: "
			+ quantidade
			+ "-  Valor Total: R$ "
			+ String.format("%.3f",total_valor());
			
	}
	
	
}
