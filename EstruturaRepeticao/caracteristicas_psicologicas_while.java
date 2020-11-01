/*Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de uma 
 região. Para tanto, a cada uma das pessoas era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros)
e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva).
 Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
o número de pessoas calmas; 
o número de mulheres nervosas; 
o número de homens agressivos; 
o número de outros calmos;
o número de pessoas nervosas com mais de 40 anos; 
o número de pessoas calmas com menos de 18 anos.
*/
package lista2_EstruturaRepeticao;

import java.util.Scanner;

public class exercicio4_while {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		
		int idade =0,sexo=0, opc=0, contador=0;
		int pessoaCalma=0, mulherNervosa=0, homemAgressivo=0, outrosCalmos=0, nervosa40=0,calmo18=0;
		while(contador <150) {
			System.out.print("Digite a idade: ");
			idade = leia.nextInt();
			
			System.out.print("Digite [1]Feminino - [2]Masculino - [3]Outros: ");
			sexo = leia.nextInt();
			
			System.out.print("[1] Pessoa Calma \n[2] Pessoa Nervosa \n[3] Pessoa Agressiva");
			opc= leia.nextInt();
			
			if(opc == 1) {
				pessoaCalma+=1;
			}
			if((sexo == 1) && (opc == 2)) {
				mulherNervosa += 1;
			}
			if((sexo == 2) && (opc == 3)) {
				homemAgressivo +=1;
			}
			if((sexo == 3) && (opc == 1)) {
				outrosCalmos += 1;
			}
			if((idade > 40) && (opc == 2)) {
				nervosa40 += 1;
			}
			if((idade <18) && (opc == 1)) {
				calmo18 += 1;
			}
			System.out.println();
			contador += 1;
			
			leia.close();
			
		}
		System.out.printf("Pessoas Calmas: %d ",pessoaCalma );
		System.out.println();
		System.out.printf("Mulheres Nervosas: %d ",mulherNervosa);
		System.out.println();
		System.out.printf("Homens Agressivos: %d ",homemAgressivo);
		System.out.println();
		System.out.printf("Outros Calmos: %d ",outrosCalmos);
		System.out.println();
		System.out.printf("Pessoas Nervosas com mais de 40 anos: %d ",nervosa40);
		System.out.println();
		System.out.printf("Pessoas Calmas com menos de 18 anos: %d ",calmo18);
		
		leia.close();
	}

}
