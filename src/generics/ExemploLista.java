package generics;

import java.util.List;
import java.util.ArrayList;

public class ExemploLista {

	public static void main(String[] args) {
		/**
		 * <p>
		 * Cria uma lista com elementos do tipo {@code String}.
		 * </p>
		 */
		List<String> nomes = new ArrayList<>();
		nomes.add("Douglas Souza de Lima");
		nomes.add("Elizabeth Soares");
		nomes.add("Rodrigo Peixoto");
		nomes.add("Maria Eduarda");
		for(String nome : nomes) {
			System.out.println(nome);
		}
		System.out.println();
		System.out.println("Elemento na posição 0: " + nomes.get(0));
		System.out.println("Quantidade de elementos: " + nomes.size());
	}

}