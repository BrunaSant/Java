/*Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. 
 *Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)*/
package lista2_EstruturaRepeticao;

import java.util.Scanner;

public class exercicio3_while {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int idade =0,menor21=0,maior50=0;
		while(idade != 99) {
			System.out.print("Digite sua idade: ");
			idade = leia.nextInt();
			if(idade <= 21) {
				menor21 +=1;
			}
			if (idade >= 50) {
				maior50 +=1;
			}
		}
		System.out.println();
		System.out.printf("%d pessoas tem menos de 21 anos",menor21);
		System.out.println();
		System.out.printf("%d pessoas tem mais de 50 anos", maior50);
		leia.close();
	}
	
}

