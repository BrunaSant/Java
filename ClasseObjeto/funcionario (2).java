package lista4_ClasseObjeto;

import java.util.Scanner;

public class exercicio4_funcionario {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		funcionario func = new funcionario();
		// nome idade area salario tempEmpresa
		System.out.println("Digite o nome: ");
		func.nome = leia.next();
		
		System.out.println("Digite a idade: ");
		func.idade = leia.nextInt();
		
		System.out.println("Digite a área: ");
		func.area = leia.next();
		
		System.out.println("Digite o salario: ");
		func.salario = leia.nextInt();
		
		System.out.println("Digite o tempo que trabalha na empresa: ");
		func.tempEmpresa = leia.nextInt();
		
		System.out.println("----------FICHA DO FUNCIONARIO----------");
		System.out.println("nome: "+func.nome);
		System.out.println("Idade: "+func.idade);
		System.out.println("Área: "+func.area);
		System.out.println("Salario: "+func.salario);
		System.out.println("Tempo de Empresa: "+func.tempEmpresa);
		leia.close();

	}

}
