/*5-Crie um programa que leia um número do teclado até que encontre um número igual a zero. 
 No final, mostre a soma dos números digitados.(DO...WHILE)*/
package lista2_EstruturaRepeticao;

import java.util.Scanner;

public class exercicio5_do_while {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int num = 1,soma = 0;
		
		do{
			System.out.print("Digite um número: ");
			num = leia.nextInt();
			soma += num;
						
		}
		while (num > 0);
		 System.out.printf("A soma é: %d",soma);
		 
		 leia.close();
	}

}
