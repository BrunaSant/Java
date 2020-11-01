package aplicacoes;

import java.util.Scanner;

public class possibilidade {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int a, b;
		
		System.out.print("Digite A: ");
		a = leia.nextInt();
		
		System.out.print("Digite B: ");
		b = leia.nextInt();
		
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.printf("A: %d   /   B: %d ",a,b);
		leia.close();
	}

}
