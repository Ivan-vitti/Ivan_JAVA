package Exe02;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		Atributos valor = new Atributos();
		
		System.out.println("Informações: ");
		System.out.print("Informe seu Nome: ");
		valor.nome = sc.nextLine();
		System.out.print("Qual o valor do seu salario Bruto: ");
		valor.salario = sc.nextDouble();
		System.out.print("Qual o valor do imposto?: ");
		valor.imposto = sc.nextDouble();
		
		System.out.println(valor);
		
		System.out.println("Informe a Porcentagem do aumento do funcionario:");
		valor.aumento = sc.nextDouble();
		
		System.out.println("Seu novo salario é: " + valor.total);
		
		
		System.out.println(valor);
		
		
		sc.close();
	}

}

