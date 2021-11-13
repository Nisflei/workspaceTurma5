package br.com.aula8.beans;

public class Aluno implements Comparable<Aluno> {
	private String nome;
	private double media;
	private int faltas;
	private int idade;
	
	public Aluno() {};
	
	public Aluno(String nome, double media, int faltas, int idade) {
		super();
		this.nome = nome;
		this.media = media;
		this.faltas = faltas;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	public int getFaltas() {
		return faltas;
	}

	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public int compareTo(Aluno outroAluno) {
		
		// ordena por idade
		if (this.idade > outroAluno.getIdade()) {
			return 1;
		}
		if (this.idade < outroAluno.getIdade()) {
			return -1;
		}
		return 0;
		// Ordena por String
		//return this.nome.compareTo(outroAluno.getNome());
	}
	
}
