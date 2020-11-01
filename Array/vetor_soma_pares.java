package lista3_Array;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner leia =new Scanner(System.in);
		int num []= new int[6];
		int soma = 0;
		int cont = 0;
		for(int x = 0; x < num.length; x++) {
			System.out.print("Digite um número: ");
			num[x]= leia.nextInt();
		}
		for(int x = 0; x < num.length; x++) {
			if(num[x] % 2 == 0) {
				soma += num[x];
			System.out.printf(num[x]+" - ");
			}
		}
		System.out.println();
		for(int x = 0; x < num.length; x++) {
			if(num[x] % 2 == 1) {
				cont += 1;
			System.out.printf(num[x]+" - ");
			}
		}
		
		System.out.printf("\nA soma dos pares da : %d",soma);
		System.out.printf("\n%d números ímpares foram digitados",cont);
		leia.close();
	}

}
