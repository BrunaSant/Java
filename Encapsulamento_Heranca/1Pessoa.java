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
	public Exercicio1Pessoa(String nome, String enderešo) {
		this.nome = nome;
		this.endereco = enderešo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEnderešo() {
		return endereco;
	}
	public void setEnderešo(String enderešo) {
		this.endereco = enderešo;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
}