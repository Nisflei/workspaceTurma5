package br.com.aula8.implementacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.aula8.beans.Aluno;

public class ExecutarCollection {

	public static void main(String[] args) {

		List<String> listaNome = new ArrayList<String>();

		listaNome.add("Beatriz");
		listaNome.add("Pedro");
		listaNome.add("Ana");
		listaNome.add("Ana Beatriz");

		System.out.println("Tamanho dinamico: " + listaNome.size());

		System.out.println("Mostrar posição [2]:" + listaNome.get(2));

		System.out.println("Lista Original:" + listaNome);
		Collections.sort(listaNome);
		System.out.println("Lista Organizada:" + listaNome);

		// Pesquisar no Vetor
		String pesquisa = null;
				//JOptionPane.showInputDialog("Digite o nome para pesquisa:");

		int i = listaNome.indexOf(pesquisa);

		if (i >= 0) {
			System.out.println("Econtrado na posição:" + i + " - " + listaNome.get(i));
		} else {
			System.out.println("Não encontrado..!!");
		}

		// Agora é com Classe 
		System.out.println("--Agora é com Classe :-) ");
		
		List<Aluno> listaAluno = new ArrayList<Aluno>();
		
		Aluno a1 = new Aluno("Pedro", 8, 50, 20);
		Aluno a2 = new Aluno("Ana", 9, 5, 21);
		Aluno a3 = new Aluno("Maria", 8, 0, 18);		
		
		listaAluno.add(a1);
		listaAluno.add(a2);
		listaAluno.add(a3);
	
		System.out.println("Tamanho dinamico: " + listaAluno.size());

		System.out.println("Mostrar posição [2]:" + listaAluno.get(2).getNome());

		System.out.println("Lista Original:" + listaAluno);
		
		
		for (Aluno elAluno: listaAluno) {
			System.out.println(elAluno.getNome() + " idade:" + elAluno.getIdade());
		}
		Collections.sort(listaAluno);

		System.out.println("Lista por Idade:" + listaAluno);

		for (Aluno elAluno: listaAluno) {
			System.out.println(elAluno.getNome() + " idade:" + elAluno.getIdade());
		}

	 
		
		
	}

}
