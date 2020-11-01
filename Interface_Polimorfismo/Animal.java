package lista6_Interface_Polimorfismo;

public class Ex1Animal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex1Cachorro cao = new Ex1Cachorro("Bob", 3);
		System.out.printf("Esse é o %s, Diz oi %s: ",cao.getNome(),cao.getNome());
		cao.emitirSom();
		
		Ex1Preguica preguica = new Ex1Preguica("Lolita", 19);
		System.out.printf("Essa é a %s...", preguica.getNome());
		preguica.subirArvore();
		
		
		Ex1Cavalo cavalo = new Ex1Cavalo("Pangaré", 7);
		System.out.printf("Esse é o %s, diz oi %s... ",cavalo.getNome(),cavalo.getNome());
		cavalo.emitirSom();
	}

}
