package lista5_Encapsulamento_Heranca;

public class Exercicio3Pessoa {
	
	public static void main(String[] args) {
		Exercicio3PessoaClasse pessoa = new Exercicio3PessoaClasse("joao","Masculino",1554);
		Exercicio3Operario operario = new Exercicio3Operario("Maria","Feminino", 889, 1550, 1);
		
		System.out.println(pessoa.getNome()+" "+ pessoa.getSexo());
		System.out.println(operario.getNome());
	}

}
