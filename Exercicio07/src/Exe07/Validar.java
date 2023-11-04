package Exe07;

import java.util.Scanner;

public class Validar {

	public static int ler_menu(Scanner sc) {
		int escolha;

		while (true) {

			if (sc.hasNextInt()) {
				escolha = sc.nextInt();
				if (escolha >= 0 && escolha <= 3) {
					return escolha;

				} else {
					System.out.println("Número fora do intervalo permitido. Tente novamente.");
				}

			} else {
				sc.nextLine();
				System.out.println("Entrada inválida. Digite um número inteiro entre 0 e 3.");
			}
		}
	}

//---------------------------------------------------------------
	public static String ler_nome(Scanner sc) {
		String nome;
		sc.nextLine();

		while (true) {
			nome = sc.nextLine().trim();
			if (nome.matches("^[A-Za-z]+(?:\\s[A-Za-z]+)*$")) {
				return nome;
			} else {
				System.out.println("O nome não pode conter números ou caracteres especiais.");
				System.out.print("Por favor, insira um nome válido: ");
			}
		}
	}

//---------------------------------------------------------------	
	public static int ler_idade(Scanner sc) {
		int idade;
		while (true) {
			if (sc.hasNextInt()) {
				idade = sc.nextInt();
				if (idade >= 0 && idade <= 150) {
					return idade;

				} else {
					System.out.println("Número fora do intervalo permitido. Tente novamente.");
				}

			} else {
				sc.nextLine();
				System.out.println("Entrada inválida. Digite um número inteiro entre 0 e 150.");
			}
		}
	}

//---------------------------------------------------------------
	public static double ler_altura(Scanner sc) {
		double altura;
		while (true) {
			if (sc.hasNextDouble()) {
				altura = sc.nextDouble();
				if (altura >= 0.0 && altura <= 3.0) {
					return altura;

				} else {
					System.out.println("Número fora do intervalo permitido. Tente novamente.");
				}

			} else {
				sc.nextLine();
				System.out.println("Entrada inválida. Digite um número inteiro entre 0 e 150.");
			}
		}
	}

//---------------------------------------------------------------
	public static String ler_cpf(String cpf) {
		cpf = cpf.replaceAll("[^0-9]", "");
		if (cpf.length() != 11) {
			return null;
		}

		int sum = 0;
		for (int i = 0; i < 9; i++) {
			int digit = Character.getNumericValue(cpf.charAt(i));
			sum += digit * (10 - i);
		}
		int firstDigit = 11 - (sum % 11);
		if (firstDigit >= 10) {
			firstDigit = 0;
		}

		if (Character.getNumericValue(cpf.charAt(9)) != firstDigit) {
			return null;
		}

		sum = 0;
		for (int i = 0; i < 10; i++) {
			int digit = Character.getNumericValue(cpf.charAt(i));
			sum += digit * (11 - i);
		}
		int secondDigit = 11 - (sum % 11);
		if (secondDigit >= 10) {
			secondDigit = 0;
		}

		if (Character.getNumericValue(cpf.charAt(10)) != secondDigit) {
			return null;
		}

		return cpf;
	}

//---------------------------------------------------------------	
	public static char ler_sexo(Scanner sc) {
        char sexo;
        do {
            String input = sc.nextLine().trim().toUpperCase();

            if (input.length() == 1 && (input.charAt(0) == 'M' || input.charAt(0) == 'F')) {
                sexo = input.charAt(0);
                return sexo;
            } else {
                System.out.println("Resposta inválida. Por favor, digite 'M' para masculino ou 'F' para feminino.");
            }
        } while (true);
    }
	
//---------------------------------------------------------------
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
