package Aula02;

public class Conta {

	private double saldo;
	
	public void depositar(double valor) {
		saldo += valor;
	}
	public double getSaldo() {
		return saldo;
	}
}
