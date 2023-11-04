package Exe07;


public class Pessoa {

	private int codigo;
	private String nome;
	private int idade;
	private double altura;
	private String cpf;
	private char sexo;

	public Pessoa(int codigo, String nome, int idade, double altura, String cpf, char sexo) {
		this.codigo = codigo;
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.cpf = cpf;
		this.sexo = sexo;
	}
//--------------------------------------------------------------------------------

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

}
