package lista6_Interface_Polimorfismo;

public class Ex1Cavalo extends Ex1Cachorro {

	public Ex1Cavalo(String nome, int idade) {
		super(nome, idade);
		
	}
	public void emitirSom() {
		System.out.println("buuuuuu");
	}
	public void correr() {
	}
	
}
