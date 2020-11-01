/*3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
 10-14 infantil
 15-17 juvenil
 18-25 adulto*/
package lista1_LacoCondicional;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int num = 0;
		System.out.print("Digite um número: ");
		num = leia.nextInt();
		
		if(num >= 10 && num <= 14) {
			System.out.println("Infantil");
		}
		else if (num >=15 && num <= 17) {
			System.out.println("Juvenil");
		}
		else if(num >= 18 && num <= 25) {
			System.out.println("Adulto");
		}
		else {
			System.out.println("Número fora da tabela");
		}
		leia.close();

	}

}
