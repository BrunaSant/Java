package aplicacoes;

import java.util.Scanner;

public class lista1exercicio7 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a, b, c, d, ee, f, x, y;
		System.out.print("A: ");
		a = ler.nextInt();
		System.out.print("B: ");
		b = ler.nextInt();
		System.out.print("C: ");
		c = ler.nextInt();
		System.out.print("D: ");
		d = ler.nextInt();
		System.out.print("E: ");
		ee = ler.nextInt();
		System.out.print("F: ");
		f = ler.nextInt();
		
		x = ((c*ee) - (b * f)) / ((a* ee) - (b * d));
		y = ((a*f) - (c*d)) / ((a*ee) - (b*d));
		
		System.out.println("O valor de X é: "+x);
		System.out.println("O valor de Y é: "+y);
		ler.close();
	}

}
