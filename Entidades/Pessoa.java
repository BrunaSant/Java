package entidades;

public class Pessoa {
	private String nome;
	private char sexo;
	private int anoNascimento;

	public Pessoa(String nome, char sexo, int anoNascimento) {
		super();
		this.nome = nome;
		this.sexo = sexo;
		this.anoNascimento = anoNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	public int idade() {
		int idade;
		int anoAtual = 2020;
		idade = anoAtual - this.getAnoNascimento();
		return idade;
	}
	public int idade(int anoAtual) {
		int idade;
		idade = anoAtual - this.getAnoNascimento();
		return idade;
	}
}
