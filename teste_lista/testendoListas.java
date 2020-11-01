package teste2;

import java.util.ArrayList;

public class testendoListas {
	 public static void main(String[] args) {
		String aula1 = "Conhecendo aula 1";
		String aula2 = "Conhecendo aula 2";
		String aula3 = "Conhecendo aula 3";
		
		ArrayList<String> aulas = new ArrayList<>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		
		System.out.println(aulas);
		
		aulas.remove(0);
		
		System.out.println(aulas);
		
		for (String aula : aulas) {
			System.out.println("Aula: "+aula);
		}
	}
}
