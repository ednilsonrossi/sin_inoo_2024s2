package br.edu.ednilsonrossi;

public class Estatica {
	private static int instancias = 0;
	private int numero;
	
	public Estatica() {
		instancias += 1;
	}

	public Estatica(int numero) {
		this();
		this.numero = numero * 2;
	}
	
	public static int quantidadeDeInstancias() {
		return instancias;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	public static void main(String[] args) {
		Estatica estatica = new Estatica(7);
		System.out.println("Numero: " + estatica.getNumero());
		
		Estatica estatica2 = new Estatica(14);
		System.out.println("Numero: " + estatica2.getNumero());
		
		int i;
		for (i = 0; i < 100; i++) {
			System.out.println("Número: " + new Estatica(i).getNumero());
		}
		estatica2 = new Estatica(14);
		
		System.out.println("Foram instanciados " + Estatica.quantidadeDeInstancias() + " objetos da classe Estatica.");
	}
	
}















