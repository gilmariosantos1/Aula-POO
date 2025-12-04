package Aula02;

public class Produto {
	private String nome;
	private int quantidade;
			
	public void gravarNome(String novoNome) {
		nome = novoNome;
	}
	
	public String getNomeProduto() {
		return nome;
	}
	
	public void estocarProduto(int novaQuantidade) {
		quantidade += novaQuantidade;
	}
	
	public int getTotalProduto() {
		return quantidade;
	}

	
}
