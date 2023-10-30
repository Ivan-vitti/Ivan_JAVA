package Exer06;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	
		
		Atributos[] Vetor = new Atributos[2];
		double soma = 0.0;
		
		for ( int i = 0; i < Vetor.length; i++) {
			System.out.print("Informe o nome do produto: ");
			String name = sc.nextLine();
			System.out.print("Informe o preço do produto: ");
			double preco = sc.nextDouble();
			System.out.print("Informe a Quantidade do produto: ");
			int quant = sc.nextInt();
			
			Vetor[i] = new Atributos(name, preco, quant);
					
			soma += (Vetor[i].getPreco() * Vetor[i].getQuant() );
			
			sc.nextLine();
		}
		
		System.out.print("o valor total e Reais que temos no estoque é:  " + soma);
		
		
		
		
		
		
		
		
		
		
		
/*		int n = sc.nextInt();
 		double[] Vetor = new double[n];
		double m = 0.0;
		
		for ( int i = 0; i < n; i++) {
			System.out.print("Informe o "+ ( i + 1 ) +"º numero: ");
			Vetor[i] = sc.nextDouble();
			m += Vetor[i];
		}
		System.out.print("O total dos valores é: " + m + " A media dos valores é: " + m/n );
*/		
		
		
		
		sc.close();
	}
}
