package lista6_Interface_Polimorfismo;

import java.util.ArrayList;

public class Ex3Collections {
	public static void main(String[] args) {
		ArrayList<String> estoque = new ArrayList<>();
		estoque.add("Camiseta");
		estoque.add("Calça");
		estoque.add("Camisa");
		estoque.add("Meia");
		estoque.add("Cueca");
		
		System.out.println(estoque);
		
		estoque.remove(2);
		
		System.out.println(estoque);
		for (String item : estoque) {
				System.out.println("Item "+item);
		}
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
		for(int i = 0; i < estoque.size(); i++) {
			System.out.printf("Item"+i +" "+ estoque.get(i)+" \n");
		}
	}
}
