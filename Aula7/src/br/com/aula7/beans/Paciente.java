package br.com.aula7.beans;

public class Paciente extends Pessoa {

	//Construtor
	public Paciente(String nome, String cpf, String fone, String endereco) {
		super(nome, cpf, fone, endereco);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pesquisar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void salvar() {
		System.out.println("SAlvar Paciente");
		
	}

	@Override
	public void excluir() {
		// TODO Auto-generated method stub
		
	}
	
	
}
