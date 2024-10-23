package br.edu.inoo;

public class ContaBancaria {
	private String titular;
	private double saldo;

	public boolean saque(double valor) {
		if (saldo >= valor && valor >= 0) {
			saldo -= valor;
			return true;
		}
		return false;
	}

	public void deposito(double valor) {
		if (valor >= 0) {
			saldo += valor;
		}
	}

	public String getTitular() {
		return titular.toUpperCase();
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public String imprime() {
		return "Titular: " + titular + "  Saldo bancário: R$ " + saldo;
	}
}
