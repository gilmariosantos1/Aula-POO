package Aula02;

public class Main {

	public static void main(String[] args) {
		//Instanciando o objeto Conta
		Conta conta = new Conta();
		
		//Depositando dinheiro na conta
		conta.depositar(5000);
		
		//Instanciando o objeto Produto
		Produto produto = new Produto();
		
		produto.gravarNome("Banana");
		produto.estocarProduto(500);
		
		
		System.out.println("Saldo em Conta: " + conta.getSaldo() + "\n" + "Nome do Produto: " + produto.getNomeProduto()
				+ "\n" +"Total Produto: " + produto.getTotalProduto()
				);

	}

}
