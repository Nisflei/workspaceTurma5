package br.com.aula8.implementacao;

import java.util.HashSet;
import java.util.Set;

public class ExecutarSET {

	public static void main(String[] args) {
		
		Set<String> h_set = new HashSet<String>();
		
		h_set.add("verde");
		h_set.add("azul");
		h_set.add("branco");
		h_set.add("preto");
		h_set.add("amarelo");

		h_set.add("verde"); // esse não entra pois é repetido
		
		// listar
		System.out.println(h_set);
		
		for (String elH_set: h_set) {
			System.out.println(elH_set);
		}
		
		// procurar elemento
		System.out.println("Tem a cor verde? " + h_set.contains("verde"));
		System.out.println("Tem a cor rosa? " + h_set.contains("rosa"));
		
		//remover
		h_set.remove("rosa");
		h_set.remove("verde");
		// listar
		System.out.println(h_set);
				
	}

}
