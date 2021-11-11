package br.com.aula7.implementacao;

import br.com.aula7.beans.Atendente;
import br.com.aula7.beans.Funcionario;
import br.com.aula7.beans.Medico;

public class ExecutarFuncionario {

	public static void main(String[] args) {

		Funcionario f1 = new Funcionario("Fausto", "12346cpf", "989898", "01/11/2021", null, 4000, "Adm");
		Medico m1 = new Medico("Dra.Ana", "12346cpf", "9898", "01/01/2021", null, 4000, "PA", "Pediatra", "135crm");
		Atendente at1 = new Atendente("Marco","12313","7777","01/09/2020",null,4000,"Adm");
		
		System.out.println("Func.Nome: "+ f1.getNome() +"Salario:" + f1.getSalario());
		f1.calcularParticipacaoLucros();
		System.out.println("");
		
		System.out.println("Med.Nome: "+ m1.getNome() +"Salario:" + m1.getSalario() + " crm:" + m1.getCrm());
		m1.calcularParticipacaoLucros();
		System.out.println("");
		
		System.out.println("Atend.Nome: "+ at1.getNome() +"Salario:" + at1.getSalario());
		at1.calcularParticipacaoLucros();
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("Atend.Nome: "+ at1.getNome() +"Salario:" + at1.getSalario());
		at1.calcularParticipacaoLucros(0.5);
		
		
//		Atendente = 0,20
//		Func = 0,10
//		Medico = 0,50

		
	}

}
