package aplicacao;

import java.util.Locale;
import java.util.Scanner;
import Entidade.Produtos;

public class Principal {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Produtos produtos = new Produtos();

		System.out.println("Informe o Produto: ");
		System.out.print("Nome: ");
		produtos.nome = sc.nextLine();
		System.out.print("Qual o preço: ");
		produtos.preco = sc.nextDouble();
		System.out.print("Qual a quantidade: ");
		produtos.quantidade = sc.nextInt();
		
		System.out.println(produtos);
		
		
		sc.close();
	}

}
