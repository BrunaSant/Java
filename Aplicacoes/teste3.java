package aplicacoes;
import java.lang.Math;
import java.util.Scanner;
public class teste3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		
		String alunos [] = {"Bruna Santos","Jacqueline","Wesley","Cleitin","Refaela","Nathalia","Sarah","VIVIAN"};
		int numeros[] = new int [alunos.length];
		int quantidadeGrupos = 0, pessoasPorGrupo=0, x=0,y=0;
		
		System.out.println("Quantos grupos você quer?");
		quantidadeGrupos = leia.nextInt();
		 // quantas pessoas por grupo
		
		do {
			for(x = 0; x < numeros.length; x++) {
				int sorteio = (int)(Math.random()*alunos.length)+1;
				numeros[x] = sorteio;
			
			for( y =0; y < quantidadeGrupos; y++) {//grupo por linha 
				System.out.println("Grupo: "+(y+1));
				System.out.println("Na posição "+(x+1)+ " Temos o numero "+sorteio);
				for(int c = 0; c < pessoasPorGrupo; c++ ) {
					sorteio = (int)(Math.random()*pessoasPorGrupo)+1;

				}
			}
				System.out.println();
			}
		
		}
		while(x < 8);
		
		

	}

}
