package lista5_Encapsulamento_Heranca;

public class Exercicio3PessoaClasse {
	private String nome;
	private String sexo;
	private int credencial;
	
	public Exercicio3PessoaClasse (String nome,String sexo,int credencial) {
		this.nome = nome;
		this.sexo = sexo;
		this.credencial = credencial;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getCredencial() {
		return credencial;
	}

	public void setCredencial(int credencial) {
		this.credencial = credencial;
	}
	
}