package br.edu.ednilsonrossi.pkg4;

public class AlunoINOO extends Aluno {
	private double avaliacao1;
	private double avaliacao2;
	private double avaliacao3;

	public AlunoINOO(String nome, int prontuario, double avaliacao1, double avaliacao2, double avaliacao3){
        super(nome, prontuario);
        setAvaliacao1(avaliacao1);
        setAvaliacao2(avaliacao2);
        setAvaliacao3(avaliacao3);
    }

	public double getAvaliacao1() {
		return avaliacao1;
	}

	public void setAvaliacao1(double avaliacao1) {
		this.avaliacao1 = avaliacao1;
	}

	public double getAvaliacao2() {
		return avaliacao2;
	}

	public void setAvaliacao2(double avaliacao2) {
		this.avaliacao2 = avaliacao2;
	}

	public double getAvaliacao3() {
		return avaliacao3;
	}

	public void setAvaliacao3(double avaliacao3) {
		this.avaliacao3 = avaliacao3;
	}

	@Override
	public void calcularNcc() {
		if (getIfa() == -1)
			setNcc((getAvaliacao1() + getAvaliacao2() + getAvaliacao3()) / 3);
	}

	@Override
	public double getNcc() {
		calcularNcc();
		return super.getNcc();
	}

	@Override
	public String toString() {
		String string = "Aluno OO: " + super.toString();
		return string;
	}

}
