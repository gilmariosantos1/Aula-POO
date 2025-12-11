package RH;

import java.util.Scanner;

import Financeiro.Pagamento;
import Financeiro.PagamentoCartao;
import Financeiro.PagamentoPix;

public class Principal {

	public static void main(String[] args) {
		//Instanciando a Classe Pessoa e Classe Departamento
		Pessoa pessoa = new Pessoa();
		Departamento departamento = new Departamento();
		
		//plimorfismo
		Pagamento pagCartao = new PagamentoCartao();
		Pagamento pagPix = new PagamentoPix();
		
		pagCartao.processarPagamento(1500.00);
		pagPix.processarPagamento(5000.00);
		
		Scanner lerTeclado = new Scanner(System.in);
		
		int cont = 0;
		do {
			System.out.println("Digite seu nome: ");
			pessoa.setNome(lerTeclado.nextLine());
			
			System.out.println("Digite sua idade: ");
			pessoa.setIdade(lerTeclado.nextLine());
			
			System.out.println("Setor que trabalha:");
			departamento.setSetor(lerTeclado.nextLine());
			
			System.out.println("Cargo:");
			departamento.setCargo(lerTeclado.nextLine());
			
			System.out.println("precisa inserir outros dados? sim=0, não=99:");
			
			cont = Integer.parseInt(lerTeclado.nextLine());
			
		} while (cont != 99);
		
		System.out.println("Nome: " + pessoa.getNome() + "\nIdade: " + pessoa.getIdade() + "\nSetor: " +
							departamento.getSetor() + "\nCargo: " + departamento.getCargo());
	}

}
