package comparable_comparator;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa> {

	private String cidade;
	private String estado;
	private int idade;
	private String nome;

	public Pessoa(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public Pessoa(String nome, int idade, String estado) {
		this.nome = nome;
		this.idade = idade;
		this.estado = estado;
	}
	
	public Pessoa(String nome, int idade, String estado, String cidade) {
		this.nome = nome;
		this.idade = idade;
		this.estado = estado;
		this.cidade = cidade;
	}

	public int compareTo(Pessoa pessoa) {
		return this.nome.compareTo(pessoa.nome);
	}

	public String getCidade() {
		return cidade;
	}

	public String getEstado() {
		return estado;
	}

	public int getIdade() {
		return idade;
	}

	public String getNome() {
		return nome;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
