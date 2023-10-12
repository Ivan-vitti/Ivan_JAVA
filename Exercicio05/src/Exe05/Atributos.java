package Exe05;

public class Atributos {

	private int numero_conta;
	private String nome;
	private double deposito;

//-----------------------------------------------	
	public Atributos(int numero_conta) {
		this.numero_conta = numero_conta;
	}

//-----------------------------------------------	
	public Atributos(String nome, double deposito) {
		this.nome = nome;
		this.deposito = deposito;
	}

//-----------------------------------------------

	public int getNumero_conta() {
		return numero_conta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getDeposito() {
		return deposito;
	}

	public void setDeposito(double deposito) {
		this.deposito = deposito;
	}

//-----------------------------------------------
	public void Deposito(double deposito) {
		setDeposito(deposito);
		
	}
}
