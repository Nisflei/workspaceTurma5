package br.com.aula8.implementacao;

import java.util.HashSet;
import java.util.Set;

import javax.swing.JOptionPane;

public class ExecutarCatraca {

	public static void main(String[] args) {

		Set<String> catraca = new HashSet<String>();


		while (true) {
			String cracha = JOptionPane.showInputDialog("Cracha Codigo:");

			if (!catraca.contains(cracha)) {
				System.out.println("Bem vindo, Acesso liberado..! " + cracha);
				catraca.add(cracha);
			} else {
				System.out.println("Obrigado pela visita..! " + cracha);
				catraca.remove(cracha);
			}
			
			System.out.println(catraca);
		}

	}

}
