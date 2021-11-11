package br.com.aula7.beans;

public class Atendente extends Funcionario {

	public Atendente(String nome, String cpf, String fone, String dtAdmissao, String dtDemissao, double salario,
			String departamento) {
		super(nome, cpf, fone, dtAdmissao, dtDemissao, salario, departamento);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void pesquisar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void salvar() {
		System.out.println("Salvando Atendente");
		
	}

	@Override
	public void excluir() {
		// TODO Auto-generated method stub
		
	}
	
}
