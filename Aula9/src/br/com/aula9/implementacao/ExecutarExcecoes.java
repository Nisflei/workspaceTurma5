package br.com.aula9.implementacao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExecutarExcecoes {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		/*
		 * try { System.out.println("Dig valor1:"); int vl1 = s.nextInt();
		 * System.out.println("Dig valor2:"); int vl2 = s.nextInt();
		 * 
		 * System.out.println("Soma: " + (vl1 + vl2));
		 * 
		 * } catch (Exception ex) { System.out.println("Voce digitou algo errado..!!");
		 * ex.printStackTrace(); System.out.println("Log: Classe de erro=" +
		 * ex.getClass()); }
		 * 
		 * 
		 * 
		 * String senha="java";
		 * 
		 * try { System.out.println("Digite a palavra SECRET:"); String palavraSecret =
		 * s.nextLine();
		 * 
		 * if (!senha.equalsIgnoreCase(palavraSecret)) { throw new
		 * Exception("informação ERRADA..!"); }
		 * 
		 * System.out.println("Liberado..!!");
		 * 
		 * } catch(Exception ex) { System.out.println(ex.getMessage()); } finally {
		 * System.out.println("Rotina final..!!"); }
		 */

		// usando outros exceptions
		int vl1, vl2=0;
		
		try {
			System.out.println("Dig valor1:");
			vl1 = s.nextInt();
			System.out.println("Dig valor2:");
			vl2 = s.nextInt();
			
			if (vl1 == 0) {
				throw new Exception("Não é permitido o valor " + vl1);
			}

			System.out.println("Divisão: " + (vl1 / vl2));

		} catch (InputMismatchException ex) {
			System.out.println("Não é permitido digitar LETRAS..!!");
		} catch (ArithmeticException ex) {
			System.out.println("o valor "+ vl2 +" deve ser > zero..!!");
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
			//ex.printStackTrace();
			//System.out.println("Voce digitou algo errado..!!");
		}
	}
}
