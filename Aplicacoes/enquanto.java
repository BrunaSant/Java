package aplicacoes;

import java.util.Scanner;

public class enquanto {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num = 0;
		char opc = 'S';
		
		while (opc == 'S') {
			System.out.println(num++);
			System.out.print("Continua [S] sim ou [N] não");
			opc = leia.next().toUpperCase().charAt(0);
		}
		System.out.println("FIM DE PROGRAMA");
		leia.close();
		
	}

}
