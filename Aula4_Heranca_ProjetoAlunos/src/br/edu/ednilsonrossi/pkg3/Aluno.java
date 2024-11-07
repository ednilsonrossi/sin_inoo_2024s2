package br.edu.ednilsonrossi.pkg3;

public class Aluno {
	private String nome;
	private int prontuario;
	private double ncc;
	private double ifa;

	public Aluno(String nome, int prontuario) {
		setNome(nome);
		this.prontuario = prontuario;
		this.ncc = -1;
		this.ifa = -1;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome.toUpperCase();
	}

	public int getProntuario() {
		return prontuario;
	}

	public void setProntuario(int prontuario) {
		this.prontuario = prontuario;
	}

	public double getNcc() {
		return ncc;
	}
	
	protected void setNcc(double ncc) {
        this.ncc = validarNota(ncc) ? ncc : -1;
    }

	public double getIfa() {
		return ifa;
	}

	public void setIfa(double ifa) {
		this.ifa = validarNota(ifa) ? ifa : -1;
		if (getIfa() > getNcc()) {
			setNcc(ifa);
		}
	}

	protected boolean validarNota(double nota) {
		return nota >= 0 && nota <= 10;
	}
}
