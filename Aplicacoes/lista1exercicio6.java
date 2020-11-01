package aplicacoes;

import java.util.Scanner;

public class lista1exercicio6 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		 
		double x1=0, x2=0, y1=0, y2=0, d=0, raiz=0;
		
		System.out.print("Digite X1: ");
		x1 = leia.nextDouble();
		System.out.print("Digite X2: ");
		x2 = leia.nextDouble();
		System.out.print("Digite Y1: ");
		y1 = leia.nextDouble();
		System.out.print("Digite Y2: ");
		y2 = leia.nextDouble();
		
		d = ( (x2-x1) * (x2-x1) ) + ( (y2-y1)*(y2-y1) );
		raiz = Math.sqrt(d);
		System.out.printf("A raiz é: %.2f",raiz);
		leia.close();
	}

}
