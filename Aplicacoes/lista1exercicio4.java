/*Escreva  um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e calcule a seguinte express�o: D= (R+S)/2   ~   R= (A + B)�  ~  S= (B + C)�*/
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
		
		System.out.println("O valor de R �: "+r);
		System.out.println("O valor de S �: "+s);
		System.out.println("O valor de D �: "+d);
		leia.close();
	}

}
