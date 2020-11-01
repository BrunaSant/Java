package lista4_ClasseObjeto;

import java.util.Scanner;

public class exercicio2_Aviao_Objeto {

	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		aviao venda = new aviao();
		
		System.out.println("Digite a origem: ");
		venda.origem = leia.next();
		
		System.out.println("Digite o destino: ");
		venda.destino = leia.next();
		
		System.out.println("Digite poltronas disponíveis: ");
		venda.poltronasDisponiveis = leia.nextInt();
		
		System.out.println("");
		System.out.println("O Origem é: "+venda.origem);
		System.out.println("O destino é: "+venda.destino);
		System.out.println("Poltronas Disponíveis: "+venda.poltronasDisponiveis);
		leia.close();
	}

}
