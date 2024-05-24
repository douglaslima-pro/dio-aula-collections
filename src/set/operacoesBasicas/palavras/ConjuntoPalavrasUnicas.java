package set.operacoesBasicas.palavras;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class ConjuntoPalavrasUnicas {

	private Set<String> palavras;

	public ConjuntoPalavrasUnicas() {
		this.palavras = new HashSet<>();
	}

	public void adicionarPalavra(String palavra) {
		System.out.println();
		System.out.println("ADICIONANDO a palavra '" + palavra + "' ao conjunto...");
		if (this.palavras.add(palavra)) {
			System.out.println("A palavra '" + palavra + "' foi adicionada ao conjunto!");
		} else {
			System.out.println("ERRO: A palavra '" + palavra + "' JÁ existe no conjunto!");
		}
	}

	public void removerPalavra(String palavra) {
		System.out.println();
		System.out.println("REMOVENDO a palavra '" + palavra + "' do conjunto...");
		if (this.palavras.remove(palavra)) {
			System.out.println("A palavra '" + palavra + "' foi removida do conjunto!");
		} else {
			System.out.println("ERRO: A palavra '" + palavra + "' NÃO existe no conjunto!");
		}
	}

	public void verificarPalavra(String palavra) {
		System.out.println();
		System.out.println("VERIFICANDO se o conjunto contém a palavra '" + palavra + "'...");
		if (this.palavras.contains(palavra)) {
			System.out.println("O conjunto contém a palavra '" + palavra + "'!");
		} else {
			System.out.println("O conjunto NÃO contém a palavra '" + palavra + "'!");
		}
	}

	public void exibirPalavrasUnicas() {
		System.out.println();
		if (!this.palavras.isEmpty()) {
			Iterator<String> palavrasIterator = this.palavras.iterator();
			System.out.println("PALAVRA");
			System.out.println("-------");
			while (palavrasIterator.hasNext()) {
				System.out.println(palavrasIterator.next());
			}
		} else {
			System.out.println("O conjunto está VAZIO!");
		}
	}

}
