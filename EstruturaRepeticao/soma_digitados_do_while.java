/*5-Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. 
 No final, mostre a soma dos n�meros digitados.(DO...WHILE)*/
package lista2_EstruturaRepeticao;

import java.util.Scanner;

public class exercicio5_do_while {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int num = 1,soma = 0;
		
		do{
			System.out.print("Digite um n�mero: ");
			num = leia.nextInt();
			soma += num;
						
		}
		while (num > 0);
		 System.out.printf("A soma �: %d",soma);
		 
		 leia.close();
	}

}
