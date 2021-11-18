package br.com.aula9.implementacao;

import java.util.HashMap;
import java.util.Map;

public class ExecutarMAP {

	public static void main(String[] args) {
		Map<Integer, String> h_map = new HashMap<Integer, String>();
		
		//adiciona elementos
		h_map.put(10, "azul");
		h_map.put(9, "preto");
		h_map.put(15, "verde");
		h_map.put(1, "branco");
		
		// listar
		System.out.println(h_map.entrySet());
		System.out.println(h_map.keySet());
		System.out.println(h_map.values());
		
		h_map.put(15,"azul");
		System.out.println(h_map.entrySet());
		
		for (Map.Entry conteudo: h_map.entrySet()) {
			System.out.println("Chave:" + conteudo.getKey() + " valor:" + conteudo.getValue());
		}
		
		// procurar elemento
		System.out.println("Tem a chave 10 ? " + h_map.containsKey(10));
		System.out.println("Tem o valor 'Branco'? " + h_map.containsValue("Branco"));		
		
		// remover
		h_map.remove(15);
		System.out.println(h_map.entrySet());
		
		
	}

}
