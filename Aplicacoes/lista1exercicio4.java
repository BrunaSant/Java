/*Escreva  um sistema que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão: D= (R+S)/2   ~   R= (A + B)²  ~  S= (B + C)²*/
package aplicacoes;

import java.util.Scanner;

public class lista1exercicio4 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int a, b, c;
		
		System.out.print("Digite o valor de A: ");
		a = leia.nextInt();
		System.out.print("Digite o valor de B: ");
		b = leia.nextInt();
		System.out.print("Digite o valor de C: ");
		c = leia.nextInt();
		
		int r = (a + b)*(a + b);
		int s = (b + c)*(a + c);
		int d = (r + s)/2;
		
		System.out.println("O valor de R é: "+r);
		System.out.println("O valor de S é: "+s);
		System.out.println("O valor de D é: "+d);
		leia.close();
	}

}
