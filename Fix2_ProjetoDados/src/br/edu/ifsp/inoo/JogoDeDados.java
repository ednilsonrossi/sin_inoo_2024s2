package br.edu.ifsp.inoo;

public class JogoDeDados {

	public static void main(String[] args) {
		int soma;
		Dice dado1 = new Dice();
		Dice dado2 = new Dice();

		for (int i = 0; i < 3; i++) {
			dado1.play();
			dado2.play();
			System.out.println("** Rodada " + (i+1) + " **");
			System.out.println("Dado 1: " + dado1.getFace());
			System.out.println("Dado 2: " + dado2.getFace());
			
			soma = dado1.getFace() + dado2.getFace();
			System.out.println("Soma dos dados: " + soma);
		}
	}

}
