package RH;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		//Instanciando a Classe Pessoa e Classe Departamento
		Pessoa pessoa = new Pessoa();
		Departamento departamento = new Departamento();
		
		
		Scanner lerTeclado = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		pessoa.setNome(lerTeclado.nextLine());
		
		System.out.println("Digite sua idade: ");
		pessoa.setIdade(lerTeclado.nextLine());
		
		System.out.println("Nome: " + pessoa.getNome() + "\nIdade: " + pessoa.getIdade());
	}

}
