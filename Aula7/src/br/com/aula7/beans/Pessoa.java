package br.com.aula7.beans;

public abstract class Pessoa implements OperacaoMetodos {
	private String nome;
	private String cpf;
	private String fone;
	private String endereco;
	
	
	public Pessoa(String nome, String cpf, String fone) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.fone = fone;
	}

	public Pessoa(String nome, String cpf, String fone, String endereco) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.fone = fone;
		this.endereco = endereco;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getFone() {
		return fone;
	}
	public void setFone(String fone) {
		this.fone = fone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	

}
