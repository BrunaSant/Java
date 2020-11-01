package lista5_Encapsulamento_Heranca;

public class Exercicio2VendedorClasse extends Exercicio2PessoaClasse{
	private double valorVenda;
	private double comissao = valorVenda * 0.9;
	
	public Exercicio2VendedorClasse (String nome,String sexo,int credencial,double valorVenda,double comissao) {
		super(nome,sexo,credencial);
		this.valorVenda = valorVenda;
		this.comissao = comissao;

	}

	public double getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
}
