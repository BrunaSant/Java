package aplicacoes;

import java.util.Scanner;

public class parImpar2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int valor=0;
		
		System.out.print("Digite um numero positivo acima de 0(zero)");
		valor = leia.nextInt();
		
		if((valor%2) ==0 && (valor > 0)) {
			System.out.printf("O número %d é par!!!",valor);
		}	
		else if((valor % 2) == 1 && (valor > 0)) {
			System.out.printf("O número %d é ímpar!!!",valor);
		}
		else {
			System.out.println("Você digitou 0(ZERO) ou negativo ou seila...");
		}
		
		leia.close();

	}

}
