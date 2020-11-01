package lista4_ClasseObjeto;

import java.util.Scanner;

public class exercicio5_Patinete {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		patinete pat = new patinete();
		
		System.out.println("Digite a cor: ");
		pat.cor = leia.next();
		
		System.out.println("Digite o tamanho[P]pequeno - [M]médio - [G]grande");
		pat.tamanho = leia.next().toUpperCase().charAt(0);
		
		System.out.println("Patinete cor: "+pat.cor);
		System.out.println("Tamanho: "+pat.tamanho);
		leia.close();

	}

}
