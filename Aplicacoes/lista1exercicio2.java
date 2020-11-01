/*2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
expressa em anos, meses e dias.*/
package aplicacoes;

import java.util.Scanner;

public class lista1exercicio2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int diaNascimento = 9;
		int mesNascimento = 5;
		int anoNascimento = 1996;
		int calculandoDia = 28 - diaNascimento;
		int calculandoMes = 9 - mesNascimento;
		int calculandoAno = 2020 - anoNascimento;
		System.out.printf(calculandoDia+ " Dias");
		System.out.println();
		System.out.printf(calculandoMes+ " Meses");
		System.out.println();
		System.out.printf(calculandoAno+ " Anos ");
		System.out.println();
		System.out.println(calculandoDia + (calculandoMes*30) + (calculandoAno * 365)+" Dias totais");
		ler.close();
	}

}
