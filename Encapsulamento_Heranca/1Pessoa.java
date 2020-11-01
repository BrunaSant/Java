package lista5_Encapsulamento_Heranca;

public class Exercicio1Pessoa {
	private String nome;
	private String endereco;
	private String telefone;
	
	public Exercicio1Pessoa() {
		
	}
	public Exercicio1Pessoa(String nome) {
		this.nome = nome;
	}
	public Exercicio1Pessoa(String nome, String endereço) {
		this.nome = nome;
		this.endereco = endereço;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereço() {
		return endereco;
	}
	public void setEndereço(String endereço) {
		this.endereco = endereço;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
}