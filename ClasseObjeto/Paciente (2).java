package lista4_ClasseObjeto;

import java.util.Scanner;

public class exercicio7_Paciente {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		paciente cliente = new paciente();
		
		System.out.println("Digite o nome: ");
		cliente.nome = leia.next();
		System.out.println("Digite a idade: ");
		cliente.idade = leia.nextInt();
		System.out.println("Digite o problema: ");
		cliente.problema = leia.next();
		
		System.out.println("----------FICHA PECIENTE----------");
		System.out.println("Nome: "+cliente.nome);
		System.out.println("Idade: "+cliente.idade);
		System.out.println("Problema: "+cliente.problema);
		leia.close();
	}

}
