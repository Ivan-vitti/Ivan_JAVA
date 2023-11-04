package Exer06;

import java.util.Locale;
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um numero: ");
		int n = sc.nextInt();
		
		double[] Vetor = new double[n];
		double m = 0.0;
		
		for ( int i = 0; i < n; i++) {
			System.out.print("Informe o "+ ( i + 1 ) +"º numero: ");
			Vetor[i] = sc.nextDouble();
			m += Vetor[i];
		}
		System.out.print("O total dos valores é: " + m + " A media dos valores é: " + m/n );
		
		
		
		
		sc.close();
	}
}
