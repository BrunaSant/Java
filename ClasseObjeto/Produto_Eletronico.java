package lista4_ClasseObjeto;

import java.util.Scanner;

public class exercicio3_Produto_Eletronico {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		eletronico produto = new eletronico();
		//produto, marca, cor, valor
		System.out.print("Digite o produto: ");
		produto.produto = leia.next();
		
		System.out.print("Digite a marca: ");
		produto.marca = leia.next();
		
		System.out.print("Digite a cor: ");
		produto.cor = leia.next();
		
		System.out.print("Digite o valor: ");
		produto.valor = leia.nextInt();
		
		System.out.println("--------------FICHA DO PRODUTO--------------");
		System.out.println("Produto: "+produto.produto);
		System.out.println("Marca: "+produto.marca);
		System.out.println("Cor: "+produto.cor);
		System.out.println("Valor: "+produto.valor);
		leia.close();
	}

}
