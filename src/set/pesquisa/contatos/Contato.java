package set.pesquisa.contatos;

import java.util.Objects;

public class Contato {

	public String nome;
	public String telefone;

	public Contato(String nome, String telefone) {
		this.nome = nome;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int hashCode() {
		return Objects.hash(this.telefone);
	}

	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof Contato)) {
			return false;
		}
		Contato c = (Contato) o;
		return this.getTelefone().equalsIgnoreCase(c.getTelefone());
	}

	public String toString() {
		return "Contato{nome='" + nome + "', telefone='" + telefone + "'}";
	}
}
