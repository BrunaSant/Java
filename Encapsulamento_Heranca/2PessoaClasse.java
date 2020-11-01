package lista5_Encapsulamento_Heranca;

public class Exercicio2PessoaClasse {
	private String nome;
	private String sexo;
	private int credencial;
	
	public Exercicio2PessoaClasse (String nome,String sexo,int credencial) {
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
/*6. Implemente a ((classe Vendedor como subclasse)) da ((classe Pessoa)). Um determinado vendedor tem como 
 * atributos da classe Pessoa e também os atributos próprios como valorVendas (correspondente ao valor 
 * monetário dos artigos vendidos) e o atributo comissao (porcentagem do valorVendas que será adicionado 
 * ao vencimento base do Vendedor).*/

/*
 * Classe Pessoa -> nome - sexo - credencial
 * SubClasse Vendedor ->valorvenda produto - comissao - vencimento */
 