package Exer03;

import java.util.Scanner;

public class Atributos {

	public String nome;
	public double nota01;
	public double nota02;
	public double nota03;

	public double Verificador(Scanner scanner, double min, double max) {
		double valor;

		do {
			System.out.print("Digite um valor entre " + min + " e " + max + ": ");
			valor = scanner.nextDouble();

			if (valor < min || valor > max) {
				System.out.println("Valor fora do intervalo. Tente novamente.");
			}

		} while (valor < min || valor > max);
		return valor;
	}

	public void Total() {
		double total = (nota01 + nota02 + nota03);
		if (total >= 60) {
			System.out.println("Parabêns, "  + nome + "  " + "Você foi Aprovadoooo.");
			System.out.println("Sua Nota é: " + total + " " + "Só Vaiii");
		} else {
			System.out.println(nome + ", " + "Infelismente você não passou sua nota foi: " + total + " Pontos");
			System.out.println("Faltou: " + (60 - total) + " Pontos para Você ser aprovado :) ");
		}
	}

}
