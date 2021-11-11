package br.com.aula7.implementacao;

import java.util.Scanner;

import javax.swing.JOptionPane;

import br.com.aula7.beans.Agendamento;
import br.com.aula7.beans.Medico;
import br.com.aula7.beans.Paciente;

public class ExecutarAgendamento {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Informações do Paciente");
		
		System.out.println("Digite o nome");
		String nomePaciente = s.nextLine();
		
		System.out.println("Digite o cpf");
		String cpf = s.nextLine();		
		
		System.out.println("Digite o fone");
		String fone= s.nextLine();

		System.out.println("Digite o endereco");
		String endereco= s.nextLine();

		Paciente paciente = new Paciente(nomePaciente,cpf,fone, endereco);
		
		paciente.salvar();

		System.out.println("Informações do Medico");
		
		System.out.println("Digite o Medico");
		String nomeMedico = s.nextLine();
		
		System.out.println("Digite o cpf Medico");
		String cpfMedico = s.nextLine();		
		
		System.out.println("Digite o fone Medico");
		String foneMedico= s.nextLine();
		
		System.out.println("Digite o crm");
		String crm= s.nextLine();
		
		System.out.println("Digite a especialidade");
		String especialidade= s.nextLine();

		Medico medico = new Medico(nomeMedico,cpfMedico,foneMedico,especialidade, crm);

		medico.salvar();
				
		System.out.println("Iniciando Agendamento");

		System.out.println("Data:");
		String data = s.nextLine();

		System.out.println("Hora:");
		String hora = s.nextLine();

		System.out.println("atendente:");
		String atendente = s.nextLine();

		System.out.println("valor:");
		double valor = s.nextDouble();
	
		s.close();
		
		Agendamento agenda = new Agendamento(paciente,data,hora,medico,valor,atendente);
		
		agenda.agendar();		
		
		
	}

}
