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
		String nome = sc.nextLine();
		
		
		System.out.print("Gostaria de DEPOSITAR algum Valor: [ Sim ou Não ] : ");
	    String entrada = sc.nextLine().toLowerCase();
	    double deposito = 0;
	    if (entrada.equals("sim")) {
			System.out.print("Qual o valor para o deposito");
			deposito = sc.nextDouble();
	    } else {
			System.out.println("Você escolheu 'não'.");
		}
		Atributos dados = new Atributos(nome, deposito);
		dados.setDeposito(deposito);
//--------------------------------------		
		System.out.println("CONTA: " 
				+ atributos.getNumero_conta() + ", Titular: " 
				+ dados.getNome() + ", " 
				+ "Saldo em conta: " 
				+ dados.getDeposito() 
				+ " R$");
		
//--------------------------------------
		
		
		
		System.out.println("OBRIGADO");
		sc.close();
	}

}