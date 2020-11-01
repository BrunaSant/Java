package lista3_Array;

public class exercicio3 {

	public static void main(String[] args) {
		int matriz[][]= new int [3][3]; 
		int quantidade = 0;
		
		for(int linha =0; linha < 3; linha++) {
			
			for(int coluna =0; coluna < 3; coluna++) {
				matriz[linha][coluna] = (int) (Math.random()*15);
				System.out.println(matriz[linha][coluna]);
				if(matriz[linha][coluna] > 10) {
					System.out.print("Esse número é maior que 10(dez) \n");
					quantidade++;
				}
			}
		}
		System.out.printf("Foram inseridos %d números maiores que 10",quantidade);
	}

}
