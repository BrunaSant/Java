package entidades;
import java.util.Scanner;
public class instanciandoProfessores {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		professores primeiro = new professores();
		char info;
		
		System.out.print("Digite o nome:");
		primeiro.nome = leia.next().toUpperCase();
		System.out.print("Digite o sexo M-masculino, F-feminino ou O-outros:");
		primeiro.sexo = leia.next().toUpperCase().charAt(0);
		System.out.print("Digite a especialidade do professor: ");
		primeiro.especialidade = leia.next().toUpperCase();
		System.out.print("Digite o ano de nascimento do professor:");
		primeiro.anoNascimento = leia.nextInt();
		System.out.print("O professor é F-fixo ou C-convidado :");
		info = leia.next().toUpperCase().charAt(0);
		if (info == 'C') {
			primeiro.convidado = true;
			
		} else {
			primeiro.convidado = false;
		}
		
		System.out.println("DADOS DO PRIMEIRO PROFESSOR:");
		System.out.println("Nome: " +primeiro.nome);
		System.out.print("Sexo: ");
		System.out.println((primeiro.sexo=='F')?"Feminino":(primeiro.sexo=='M')?"Masculino":"Outros");
		System.out.println("Idade: "+(2020-primeiro.anoNascimento));
		
		leia.close();
		
	}
}