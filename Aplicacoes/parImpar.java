package aplicacoes;

import java.util.Scanner;

public class parImpar {

	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		
		int valorUsuario=0;
		 System.out.print("Digite um valor");
		 valorUsuario = leia.nextInt();
		 if(valorUsuario > 0){
			 if((valorUsuario % 2)==0) {
				 System.out.println("O valor é positivo e par");
			 }else {
				 System.out.println("O valor é positivo e ímpar");
			 }
		 }
		 else if(valorUsuario <0) {
				System.out.println("Você digitou um valor negativo");
		 }
		 else {
			 System.out.println("Você digitou 0(Zero)");
		 }
		 leia.close();
	}

}
