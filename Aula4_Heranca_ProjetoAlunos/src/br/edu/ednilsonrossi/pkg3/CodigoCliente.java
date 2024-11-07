package br.edu.ednilsonrossi.pkg3;

public class CodigoCliente {

	public static void main(String[] args) {
		
		/*
        AlunoINOO a = new AlunoINOO("Edilson", 123, 5, 5, 4);
        System.out.println(a.toString());
        a.setIfa(5);
        System.out.println(a.toString());
        */

        AlunoESDD a = new AlunoESDD("Edilson", 123, 8, 5, 3, 5);
        System.out.println(a.toString());
        a.setIfa(5);
        System.out.println(a.toString());

	}

}
