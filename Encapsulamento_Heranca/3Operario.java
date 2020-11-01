package lista5_Encapsulamento_Heranca;

public class Exercicio3Operario extends Exercicio3PessoaClasse {
	private int valorProducao;
	private int comissao;
	
	public Exercicio3Operario (String nome,String sexo,int credencial,int valorProducao,int comissao) {
		super(nome,sexo,credencial);
		this.valorProducao = valorProducao;
		this.comissao = comissao;
	}

	public int getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(int valorProducao) {
		this.valorProducao = valorProducao;
	}

	public int getComissao() {
		return comissao;
	}

	public void setComissao(int comissao) {
		this.comissao = comissao;
	}
	
}
