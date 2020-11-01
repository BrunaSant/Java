package lista5_Encapsulamento_Heranca;

public class Exercicio2Pessoa {

	public static void main(String[] args) {
		Exercicio2PessoaClasse joao = new Exercicio2PessoaClasse("Maria","fame", 15942);
		Exercicio2VendedorClasse pedrinho = new Exercicio2VendedorClasse ("pedrinho","Mascu",451,150.50,0.15);

		
		System.out.println(joao.getNome()+" "+joao.getSexo()+" "+joao.getCredencial());
		System.out.println(pedrinho.getComissao()*pedrinho.getValorVenda());
		

	}

}
