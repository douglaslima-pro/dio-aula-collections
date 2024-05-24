package set.operacoesBasicas.convidados;

<<<<<<< HEAD
import java.util.Objects;

=======
>>>>>>> 3fb49953bcdc6167f38285407008f718be7f2f9b
public class Convidado {

	private String nome;
	private int codigoConvite;

	public Convidado(String nome, int codigoConvite) {
		this.nome = nome;
		this.codigoConvite = codigoConvite;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigoConvite() {
		return codigoConvite;
	}

	public void setCodigoConvite(int codigoConvite) {
		this.codigoConvite = codigoConvite;
	}

<<<<<<< HEAD
	/**
	 * <p>
	 * Retorna uma representação em {@code String} de um objeto desta classe.
	 * </p>
	 * <strong>Observações:</strong>
	 * <ul>
	 * <li>É recomendado que as classes sobrescrevam este método.</li>
	 * </ul>
	 * 
	 * @return retorna uma representação em {@code String} de um objeto desta
	 *         classe.
	 */
	@Override
	public String toString() {
		return "Convidado{nome='" + this.nome + "', codigoConvite=" + this.codigoConvite + "}";
	}

	/**
	 * <p>
	 * Retorna um valor de código {@code hash} deste objeto.
	 * </p>
	 * <p>
	 * Um código hash é usado em tabelas hash. Ele funciona como um índice na tabela
	 * e tem como benefício o acesso mais rápido aos dados.
	 * </p>
	 * <p>
	 * Outros benefícios de usar hash:
	 * </p>
	 * <ul>
	 * <li><strong>Criptografia</strong> dos dados</li>
	 * <li><strong>Integridade</strong> dos dados</li>
	 * <li><strong>Unicidade</strong> dos dados</li>
	 * </ul>
	 * 
	 * @return um valor de código hash deste objeto
	 */
	@Override
	public int hashCode() {
		return Objects.hash(this.codigoConvite);
	}

	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof Convidado)) {
			return false;
		}
		Convidado c = (Convidado) o;
		return this.getCodigoConvite() == c.getCodigoConvite();
	}
}
=======
}
>>>>>>> 3fb49953bcdc6167f38285407008f718be7f2f9b
