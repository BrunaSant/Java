/*8. O custo ao consumidor de um carro novo � a soma do custo de f�brica com a percentagem do 
   distribuidor e dos impostos (aplicados ao custo de f�brica). Supondo que a percentagem do 
   distribuidor seja de 28% e os impostos de 45%*/
package aplicacoes;

import java.util.Scanner;

public class lista1exercicio8 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int valorFabrica=0;
		System.out.print("Qual o valor de fabrica? ");
		valorFabrica = leia.nextInt();
		int valorDistribuidor = ((valorFabrica * 28) / 100);
		int valorImposto = ((valorFabrica * 45) / 100);
		System.out.printf("Valor de fabrica �: %d",valorFabrica);
		System.out.println();
		System.out.printf("Valor do Distribuidor �: %d",valorDistribuidor);
		System.out.println();
		System.out.printf("Valor do imposto �: %d",valorImposto);
		System.out.println();
		System.out.printf("Valor total: %d",(valorFabrica + valorDistribuidor + valorImposto) );
		leia.close();
	}

}
