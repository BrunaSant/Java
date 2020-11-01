package lista3_Array;

public class exercicio1 {

	public static void main(String[] args) {
		int num[] = {1,0,5,-2,-5,7};
		int c = 0;
		int soma = 0;
		
		for(c = 0 ; c < 6 ; c++) {
			System.out.printf(num[c]+" / ");
		}		
		System.out.println();
		System.out.println("A soma das posições 0, 1 e 5 da: "+soma);
		num[4]=100;
		
		for(c = 0 ; c < 6 ; c++) {
			System.out.println(num[c]);
		}	

	}

}
