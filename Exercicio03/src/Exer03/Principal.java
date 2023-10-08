package Exer03;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Atributos valor = new Atributos();

		System.out.println("INFORMAÇÕES: ");
		System.out.print("Informe seu Nome: ");
		valor.nome = sc.nextLine();

		double nota01 = valor.Verificador(sc, 0, 30);
		valor.nota01 = nota01;
		
		double nota02 = valor.Verificador(sc, 0, 35);
		valor.nota02 = nota02;
		
		double nota03 = valor.Verificador(sc, 0, 35);
		valor.nota03 = nota03;
		
		valor.Total();
		
		sc.close();
	}

}
