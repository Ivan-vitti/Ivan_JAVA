package Exe07;

import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		boolean sair = false;
		
		Pessoa[] Vetor = new Pessoa[10];
		int cont = 0;

		while (!sair) {
			System.out.println(" ***** Escolha uma opção *****");
			System.out.println("1. CADASTRAR PESSOA");
			System.out.println("2. DADOS PESSOAIS");
			System.out.println("0. SAIR");

			int escolha = Validar.ler_menu(sc);

			switch (escolha) {
			case 1:
				boolean cadastroSair = false;

				while (!cadastroSair) {
					System.out.println("Você escolheu a Opção 1 Dados pessoais ");
					System.out.println("========================================================");
					System.out.println("*******INICIO DO CADASTRO*********");

					int codigo = ThreadLocalRandom.current().nextInt(100000, 1000000);
					System.out.println("Seu codigo é: " + codigo);

					System.out.println("Informe o seu nome: ");
					String nome = Validar.ler_nome(sc);

					System.out.println("Informe a sua idade: ");
					int idade = Validar.ler_idade(sc);

					System.out.println("Informe a sua altura: ");
					double altura = Validar.ler_altura(sc);
					sc.nextLine(); // Consuma a nova linha pendente

					String cpf;
					do {
			            System.out.print("Digite o CPF: ");
			            String cpfInput = sc.nextLine();

			            cpf = Validar.ler_cpf(cpfInput);

			            if (cpf == null) {
			                System.out.println("CPF inválido. Por favor, tente novamente.");
			            }
			        } while (cpf == null);
			        System.out.println("CPF válido: " + cpf);
			   
					System.out.println("Informe o sexo (M/F): ");
					char sexo = Validar.ler_sexo(sc);

					
					Vetor[cont] = new Pessoa(codigo, nome, idade, altura, cpf, sexo);

					System.out.println("Conta cadastrada com sucesso!");
					System.out.println("========================================================");

					cont += 1;
					System.out.println("Deseja Realizar outro cadastro? (1 - Sim / 0 - Sair)");
					int opcao = sc.nextInt();
					if (opcao == 0) {
						cadastroSair = true;
					}
				}

				break;

			case 2:
				System.out.println("========================================================");

				System.out.println("========================================================");
				break;

			case 0:
				System.out.println("Saindo do programa.");
				System.out.println("OBRIGADO.");
				sair = true;
				break;

			default:
				System.out.println("Escolha inválida. Tente novamente.");
				break;

			}
		}
	}

}
