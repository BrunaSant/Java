package lista4_ClasseObjeto;

import java.util.Scanner;

public class exercicio1_Cliente_Objeto {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		cliente primeiro = new cliente();
		
		System.out.print("Por favor, Digite o nome: ");
		primeiro.nome = leia.next();
		
		System.out.print("Digite a idade: ");
		primeiro.idade = leia.nextInt();
	
		System.out.print("Digite [F]feminino e [M]masculino");
		primeiro.sexo = leia.next().toUpperCase().charAt(0);
		
		System.out.println("________________________CLIENTE__________________________________");
		System.out.println("Nome: "+ primeiro.nome);
		System.out.println("Idade: "+primeiro.idade);
		System.out.println("Sexo: "+primeiro.sexo);
		leia.close();
	}

}
