package Exe05;

import java.util.Scanner;

class Validacao {

	public static String ler_nome(Scanner sc) {
		String nome;
		nome = sc.nextLine();
		if (nome.matches("^[a-zA-Z]+(\\s[a-zA-Z]+)*$")) {
			return nome;
		} else {
			System.out.println("O nome não pode conter números ou caracteres especiais.");
			return ler_nome(sc);
		}
	}

//---------------------------------------------------------------
	public static double ler_deposito(Scanner sc) {
		double deposito = 0;

		while (true) {
			String entrada = sc.nextLine().toLowerCase();
			if (entrada.equals("sim")) {
				System.out.print("Qual o valor para o depósito: ");
				try {
					deposito = Double.parseDouble(sc.nextLine());
					break;
				} catch (NumberFormatException e) {
					System.out.println("Por favor, insira um valor numérico válido.");
				}
			} else if (entrada.equals("não")) {
				System.out.println("Você escolheu 'não'.");
				break;
			} else {
				System.out.println("Opção inválida. Por favor, digite 'sim' ou 'não'.");
			}
		}
		return deposito;
	}

}