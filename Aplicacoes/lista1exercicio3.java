/*3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica
expressa em segundos e mostre-o expresso em horas, minutos e segundos.*/
package aplicacoes;

import java.util.Scanner;

public class lista1exercicio3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int segundosDigitado;
		System.out.print("Quantos segundos? ");
		segundosDigitado = leia.nextInt();
		
		int horas = (segundosDigitado / 3600);
		int minutos = (segundosDigitado % 3600) / 60;
		int segundos = (segundosDigitado %3600) % 60;
		
		System.out.println(horas+ " horas");
		System.out.println(minutos+ " minutos");
		System.out.println(segundos+ " segundos");
		leia.close();
	}

}