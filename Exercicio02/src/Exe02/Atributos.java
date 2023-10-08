package Exe02;

public class Atributos {
	public String nome;
	public double salario;
	public double imposto;
	
	public double salario_liquido() {
		return salario - imposto;
	}
	
	
	public void incremento(double aumento) {
		salario += salario * aumento / 100.0;
	}
	
	public String toString() {
		return nome + ". Seu salario Liquido é: "
			+ "R$ "
			+ String.format("%.3f", salario_liquido());

	}
}
