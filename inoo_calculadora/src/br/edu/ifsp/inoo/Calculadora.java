package br.edu.ifsp.inoo;

public class Calculadora {

	public int somar(int a, int b) {
		return a + b;
	}
	
	public int multiplicar(int a, int b) {
		return somaSucessiva(a, b);
	}
	
	private int somaSucessiva(int base, int multiplicador) {
		int resultado = 0;
		for (int i = 0; i < multiplicador; i++) {
			resultado = somar(resultado, base);
		}
		return resultado;
	}
}
