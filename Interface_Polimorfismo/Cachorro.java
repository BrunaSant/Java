package lista6_Interface_Polimorfismo;

public class Ex1Cachorro {
	private String nome;
	private int idade;
	
	public Ex1Cachorro(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
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
	public void emitirSom() {
		System.out.println("au au");
	}
	public void correr() {
		System.out.println("correndo...");
	}
}
