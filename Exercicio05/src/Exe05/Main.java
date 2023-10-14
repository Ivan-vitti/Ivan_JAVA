package Exe05;

import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Informações bancárias ");
		int numero_conta = ThreadLocalRandom.current().nextInt(100000, 1000000);
		Atributos atributos = new Atributos(numero_conta);
		System.out.println("NUMERO DA SUA CONTA É: " + atributos.getNumero_conta());
		
		
		System.out.print("Informe o nome do titular da conta: ");
		String nome = Validacao.ler_nome(sc);
		
		
		System.out.print("Gostaria de DEPOSITAR algum Valor: [ Sim ou Não ] : ");
		double deposito = Validacao.ler_deposito(sc);    
	    
	    
	    Atributos dados = new Atributos(nome, deposito);
	    dados.setDeposito(deposito);
//--------------------------------------		
		System.out.println("CONTA: " 
				+ atributos.getNumero_conta() + ", Titular: " 
				+ dados.getNome() + ", " 
				+ "Saldo em conta: " 
				+ String.format("%.2f", dados.getDeposito()) 
				+ " R$");
		
//--------------------------------------
		
		
		
		System.out.println("OBRIGADO");
		sc.close();
	}

}