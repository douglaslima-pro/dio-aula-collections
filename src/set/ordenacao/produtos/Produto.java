package set.ordenacao.produtos;

import java.util.Objects;

public class Produto implements Comparable<Produto> {

	private int codigo;
	private String nome;
	private double preco;
	private int quantidade;

	public Produto(int codigo, String nome, double preco, int quantidade) {
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	@Override
	public int compareTo(Produto p) {
		return this.nome.compareToIgnoreCase(p.getNome());
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.codigo);
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof Produto)) {
			return false;
		}
		Produto p = (Produto) o;
		return p.getCodigo() == this.codigo;
	}

	@Override
	public String toString() {
		return "Produto{codigo=" + this.codigo + ", nome='" + this.nome + "', preco=" + this.preco + ", quantidade="
				+ this.quantidade + "}";
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

}
