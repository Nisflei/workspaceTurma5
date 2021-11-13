package br.com.aula8.implementacao;

import javax.swing.JOptionPane;

import br.com.aula8.beans.Aluno;

public class ExecutarVetor {

	public static void main(String[] args) {
		
		String listaNome[] = {"Ana", "Beatriz", "Maria"};
		
		// Apresentar a lista
		
		System.out.println(listaNome[2]);
		System.out.println(listaNome);
		
		for (int posicao=0; posicao< 3; posicao++) {
			System.out.println("Indice [" + posicao + "]" + listaNome[posicao]);
		}
		
		// Pesquisar no Vetor
		String pesquisa = JOptionPane.showInputDialog("Digite o nome para pesquisa:");
		
		for (int i=0; i<3; i++ ) {
			if (listaNome[i].equalsIgnoreCase(pesquisa)) {
				System.out.println("Achou posição: " + i);
			}
		}
		
		// vetor simples de Objetos
		
		Aluno[] listaAlunos = new Aluno[5];
		
		listaAlunos[0] = new Aluno("Ana",9, 2, 20);
		listaAlunos[1] = new Aluno("Bia",9, 2, 20);
		listaAlunos[2] = new Aluno("Fausto",9, 2, 20);
		listaAlunos[3] = new Aluno("Maria",9, 2, 20);
		listaAlunos[4] = new Aluno("Pedro",9, 2, 20);
		//listaAlunos[5] = new Aluno("Pedro",9, 2, 20);

		
		// Apresentar a lista
		System.out.println("Lista de Alunos:" + listaAlunos[2].getNome());
		
		listaAlunos[2].setMedia(30);
		listaAlunos[2].setFaltas(100);
		
		System.out.println(listaAlunos[2].getFaltas());
		
		// Pesquisar no Vetor
		pesquisa = JOptionPane.showInputDialog("Digite o nome do Aluno para pesquisa:");

		for (int i=0; i< 10 ; i++ ) {
			System.out.println(i);
			if (listaAlunos[i].getNome().equalsIgnoreCase(pesquisa)) {
				System.out.println("Achou posição: " + i);
			}
		}
	}

}
