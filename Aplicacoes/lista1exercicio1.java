/*1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
dias e mostre-a expressa apenas em dias.*/
package aplicacoes;

import java.util.Scanner;

public class lista1exercicio1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a=0, m=0, d=0, dias =0;
		System.out.print("Digite quantos dias: ");
		dias = ler.nextInt();
		a = (dias/365);
		m = (dias%365)/30;
		d = (dias%365)%30;
		System.out.printf("Você tem %d ano(s), %d mes(es) e %d dia(s)",a,m,d);
		ler.close();
	}
}
