package list.pesquisa.biblioteca;

public class Livro implements Comparable<Livro> {

	private String titulo;
	private String autor;
	private int anoDePublicacao;

	public Livro(String titulo, String autor, int anoDePublicacao) {
		this.titulo = titulo;
		this.autor = autor;
		this.anoDePublicacao = anoDePublicacao;
	}

	@Override
	public int compareTo(Livro l) {
		int titulo = this.titulo.compareToIgnoreCase(l.getTitulo());
		int autor = this.autor.compareToIgnoreCase(l.getAutor());
		if (titulo != 0) {
			return titulo;
		} else if (autor != 0) {
			return autor;
		} else {
			return Integer.compare(this.anoDePublicacao, l.getAnoDePublicacao());
		}
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnoDePublicacao() {
		return anoDePublicacao;
	}

	public void setAnoDePublicacao(int anoDePublicacao) {
		this.anoDePublicacao = anoDePublicacao;
	}

}
