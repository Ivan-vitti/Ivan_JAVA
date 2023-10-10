package aplicacao;

import java.util.Locale;
import java.util.Scanner;
import Entidade.Produtos;

public class Principal {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o Produto: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Qual o preço: ");
		double preco = sc.nextDouble();
		
		Produtos produtos = new Produtos(nome, preco );	
		
		System.out.println();
		System.out.println(produtos);
		System.out.println();
		System.out.println("informe a quantidade do produto que será adicionado ao estoque");
		int quantidade = sc.nextInt();
		produtos.add_produto(quantidade);
		
		System.out.println("Atualização do Estoque: ");
		System.out.println( produtos);
		
		System.out.println();
		System.out.println("informe a quantidade de produto que será removido do estoque: ");
		quantidade = sc.nextInt();
		produtos.remover(quantidade);
		
		System.out.println("Atualização do Estoque: ");
		System.out.println( produtos);
		
		System.out.println("OBRIGADO");
		sc.close();
	}

}
