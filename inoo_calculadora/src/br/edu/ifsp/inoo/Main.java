package br.edu.ifsp.inoo;

public class Main {

	public static void main(String[] args) {
		Calculadora objCalculadora = new Calculadora();
		int a = 5;
		int b = 12;
		
		int sum = objCalculadora.somar(a, b);
		System.out.println(a + " + " + b + " = " + sum);
		
		System.out.printf("%d x %d = %d\n", a, b, objCalculadora.multiplicar(a, b));
	}

}
