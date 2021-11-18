package br.com.aula9.implementacao;

import java.util.InputMismatchException;
import java.util.Scanner;

import br.com.aula9.excecao.MeuControleExcecao;

public class executarExcecoesClasse {

	public static void main(String[] args) throws MeuControleExcecao {
		
		Scanner s = new Scanner(System.in);
		int vl1, vl2=0;
		
		try {
			System.out.println("Dig valor1:");
			vl1 = s.nextInt();
			System.out.println("Dig valor2:");
			vl2 = s.nextInt();
			
			System.out.println("Divisão: " + (vl1 / vl2));
			
		} catch (InputMismatchException ex) {
			System.out.println("vc digitou uma letra no lugar de numero.");
		} catch (Exception ex) {
			throw new MeuControleExcecao("Erro no valor", ex) ;
		}


	}

}
