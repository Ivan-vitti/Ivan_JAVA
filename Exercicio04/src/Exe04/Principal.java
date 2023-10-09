package Exe04;

import java.util.Locale;
import java.util.Scanner;

	public class Principal {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("QUAL O VALOR DO DOLLAR?: ");
		double valor = sc.nextDouble();
		
		System.out.print("Quantos dollars voce vai comprar?: ");
		double quantidade = sc.nextDouble();
				
		double total = Atributos.Converter(valor, quantidade);
		System.out.print("Você Tem que pagar: " + total + " Reais");	
		
	sc.close();
	}
}
