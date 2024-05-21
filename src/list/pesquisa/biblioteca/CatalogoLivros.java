package list.pesquisa.biblioteca;

import java.util.List;
import java.util.ArrayList;

public class CatalogoLivros {

	private List<Livro> listaDeLivros;

	public CatalogoLivros() {
		this.listaDeLivros = new ArrayList<>();
	}

	public boolean adicionarLivro(String titulo, String autor, int anoDePublicacao) {
		return this.listaDeLivros.add(new Livro(titulo, autor, anoDePublicacao));
	}

	public List<Livro> pesquisarPorAutor(String autor) {
		List<Livro> livros = new ArrayList<>();
		for (Livro l : this.listaDeLivros) {
			if (l.getAutor().compareToIgnoreCase(autor) == 0) {
				livros.add(l);
			}
		}
		return livros;
	}

	public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
		List<Livro> livros = new ArrayList<>();
		for (Livro l : this.listaDeLivros) {
			int anoDePublicacao = l.getAnoDePublicacao();
			if (anoDePublicacao >= anoInicial && anoDePublicacao <= anoFinal) {
				livros.add(l);
			}
		}
		return livros;
	}

	public Livro pesquisarPorTitulo(String titulo) {
		for (Livro l : this.listaDeLivros) {
			if (l.getTitulo().compareToIgnoreCase(titulo) == 0) {
				return l;
			}
		}
		return null;
	}

	public List<Livro> pesquisarLivros() {
		return this.listaDeLivros;
	}

}
