
package aplicacoes;

import java.util.Scanner;

public class exercicioAula {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int anoNascimento =0; 
		int sexo =0;
		int pergunta=0;
		int anoAtual = 2020;
		int idade = (anoAtual - anoNascimento);
		System.out.print("Em que ano você nasceu? ");
		anoNascimento = leia.nextInt();
		System.out.print("Digite [1]Mulher ou [2] Homem? ");
		sexo = leia.nextInt();
		System.out.print("Você é chefe de familia? [1]Sim ou [2]Não: ");
		pergunta = leia.nextInt();
		
		if(idade >= 18 && sexo == 1 && pergunta == 1) {
		System.out.printf("A chefa de familia tem %d anos e direito a 1200 reais",(anoAtual - anoNascimento));	
		}else if(idade >= 18 && sexo == 2 && pergunta == 1) {
		System.out.printf("O chefe de familia tem %d anos e direito a 600 reais",anoAtual - anoNascimento);
		}else  {
			System.out.println("Você não tem direito ao auxilio");
		}
		leia.close();
		}
	}

/*//18+ e 
//chefe de familia
//ano nascimento
//sexo
//humem 600 e se mulher 1200*/
