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
				 System.out.println("O valor � positivo e par");
			 }else {
				 System.out.println("O valor � positivo e �mpar");
			 }
		 }
		 else if(valorUsuario <0) {
				System.out.println("Voc� digitou um valor negativo");
		 }
		 else {
			 System.out.println("Voc� digitou 0(Zero)");
		 }
		 leia.close();
	}

}
