package lista6_Interface_Polimorfismo;

public class Ex1Preguica  extends Ex1Cachorro{
	
	
	public Ex1Preguica(String nome, int idade) {
		super(nome, idade);
		
	}

	public void emitirSom() {
		System.out.println("Não sei ql barulho faz...");
	}
	public void subirArvore() {
		System.out.println("Subindo");
	}
}
