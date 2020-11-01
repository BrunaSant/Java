package lista4_ClasseObjeto;

import java.util.Scanner;

public class exercicio6_Conta_Bancaria {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		banco conta = new banco();
		
		System.out.println("Digite o nome: ");
		conta.nome = leia.next();
		
		System.out.println("Digite a conta: ");
		conta.conta = leia.nextInt();
		
		System.out.println("Digite a agencia: ");
		conta.agencia = leia.nextInt();
		
		System.out.println("Nome: "+conta.nome);
		System.out.println("Agencia: "+conta.agencia);
		System.out.println("Conta: "+conta.conta);
		leia.close();
	}

}
