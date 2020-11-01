package lista5_Encapsulamento_Heranca;

public class Exercicio1PessoaClasse {

	public static void main(String[] args) {
		Exercicio1Pessoa alguem = new Exercicio1Pessoa();
		alguem.setNome("Jac");
		alguem.setEndereço("Centro - SP");
		alguem.setTelefone("123-6578");
		
		System.out.println(alguem.getNome());
		System.out.println(alguem.getEndereço());
		System.out.println(alguem.getTelefone());
	}	

}