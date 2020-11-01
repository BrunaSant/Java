/*2- Faça um programa que entre com três números e coloque em ordem crescente.*/
package lista1_LacoCondicional;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.print("Digite A: ");
		a = leia.nextInt();
		System.out.print("Digite B: ");
		b = leia.nextInt();
		System.out.print("Digite C: ");
		c = leia.nextInt();
		
		if((a>=b) && (b>=c)) {

			System.out.printf("Ordem é: A: %d, B: %d, C: %d",a,b,c);
		}
		if((b>=a) && (a>=c)) {

			System.out.printf("Ordem é: B: %d, A: %d, C: %d",b,a,c);
		}
		if((c>=b) && (b>=a)) {

			System.out.printf("Ordem é: C: %d, B: %d, A: %d",c,b,a);
		}
		if((b>=c)&& (c>= a)) {
			System.out.printf("Ordem é: B: %d, C: %d, A: %d",b,c,a);
		}
		leia.close();
	}
}
