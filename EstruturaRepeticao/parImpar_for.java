/*Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/
package lista2_EstruturaRepeticao;

import java.util.Scanner;

public class exercicio2_for {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int num=0,numPar=0,numImpar=0,contador=0;

		for(contador = 0; contador <10; contador++) {
			System.out.print("Digite um número: ");
			num = leia.nextInt();
			if((num %2) ==0) {
				numPar +=1;
			}else {
				numImpar +=1;
				leia.close();
			}
		}
		System.out.println();
		System.out.printf("%d numeros são Pares",numPar);
		System.out.println();
		System.out.printf("%d numeros são Ímpares",numImpar);
		leia.close();
	}

}
