/*Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. 
Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente*/
package aplicacoes;

import java.util.Scanner;

public class lista1exercicio5 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int nota1, nota2, nota3;
		System.out.print("Digite o valor da primeira nota: ");
		nota1 = leia.nextInt();
		System.out.print("Digite o valor da segunda nota: ");
		nota2 = leia.nextInt();
		System.out.print("Digite o valor da terceira nota: ");
		nota3 = leia.nextInt();
		
		int calculaMedia = ((nota1*2) + (nota2*3) + (nota3*5)) / 10;
		System.out.println("A média é: "+calculaMedia);
		leia.close();
	}

}
