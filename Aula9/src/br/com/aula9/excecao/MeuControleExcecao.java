package br.com.aula9.excecao;

public class MeuControleExcecao extends Exception {

	private static final long serialVersionUID = 1L;

	public 	MeuControleExcecao(String msg, Exception e) {
		super(msg,e);
		// agora é minha implementação... // 
		System.out.println("=========== Meu Exception ==========");
		System.out.println(msg);
		
	}
}
