package br.edu.ifsp.inoo;

import java.util.Scanner;

public class Triangulo {
	private int lado1;
	private int lado2;
	private int lado3;
	
	public Triangulo(int lado1, int lado2, int lado3) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}
	
	public boolean ehTriangulo() {	
		return this.lado1 + this.lado2 > this.lado3 &&
				this.lado1 + this.lado3 > this.lado2 &&
				this.lado2 + this.lado3 > this.lado1 &&
				this.lado1 > 0 && 
				this.lado2 > 0 && 
				this.lado3 > 0;
	}
	
	public boolean ehEscaleno() {
		return ehTriangulo() && 
				lado1 != lado2 &&
				lado2 != lado3 &&
				lado1 != lado3;
	}
	
	public boolean ehEquilatero() {
		return ehTriangulo() &&
				lado1 == lado2 &&
				lado1 == lado3;
	}
	
	public boolean ehIsosceles() {
		return ehTriangulo() && 
				(lado1 == lado2 || lado1 == lado3 || lado2 == lado3);
	}
	
	public String getTipo() {
		String str;
		if (!ehTriangulo()) {
			str = "Dados não formam um triângulo.";
		} else if (ehEquilatero()) {
			str = "Triangulo equilátero.";
		} else if (ehEscaleno()) {
			str = "Triangulo escaleno.";
		} else {
			str = "Triangulo isósceles.";
		}
		return str;
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Triangulo mTriangulo;
		int a, b, c;
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite os três lados: ");
			a = scanner.nextInt();
			b = scanner.nextInt();
			c = scanner.nextInt();
			
			mTriangulo = new Triangulo(a, b, c);
			System.out.println(mTriangulo.getTipo());
//			if (mTriangulo.ehTriangulo()) {
//				if (mTriangulo.ehEquilatero()) {
//					System.out.println("Triangulo equilátero.");
//				} else if (mTriangulo.ehIsosceles()) {
//					System.out.println("Triangulo isósceles.");
//				} else if (mTriangulo.ehEscaleno()) {
//					System.out.println("Triangulo escaleno.");
//				}
//			} else {
//				System.out.println("Dados não formam um triângulo.");
//			}
		}
		scanner.close();
	}
}










