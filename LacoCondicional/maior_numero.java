/*1- Faça um programa que receba três inteiros e diga qual deles é o maior.*/
package lista1_LacoCondicional;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.print("Digite o valor de A: ");
		a = leia.nextInt();
		
		System.out.print("Digite o valor de B: ");
		b = leia.nextInt();
		
		System.out.print("Digite o valor de C: ");
		c = leia.nextInt();
		
		/*if(a > b && a > c) {
			System.out.printf("O valor valor digitado foi A %d",a);
		}
		else if(b > a && b > c) {
			System.out.printf("O marios valor digitado foi B %d",b);
			
		}
		else {
			System.out.printf("O maior valor digitado foi C %d",c);
		}*/
		
		System.out.println((a>b && a>c)?"A maior":(b>a&&b>c)?"B maior":"C maior");
		leia.close();
	}

}
