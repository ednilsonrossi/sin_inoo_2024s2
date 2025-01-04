package br.edu.ednilsonrossi.pkg2;

public class CodigoCliente {
	
	public static void main(String[] args) {

		Aluno aluno = new Aluno("Tio Patinhas", 10, 10);
		//aluno.validarNota(100);
		
		AlunoESDD alunoESDD = new AlunoESDD("Hommer", 6, 5, 6);

		System.out.println(alunoESDD.toString());

		alunoESDD.setIfa(7);

		System.out.println(alunoESDD.toString());
	}
}
