package set.operacoesBasicas.convidados;

import java.util.Set;
import java.util.HashSet;

public class ConjuntoConvidados {

	private Set<Convidado> convidados;

	/**
	 * <p>
	 * Cria um objeto do tipo {@code ConjuntoConvidados} que implementa a interface
	 * {@code Set}.
	 * </p>
	 */
	public ConjuntoConvidados() {
		this.convidados = new HashSet<>();
	}

	/**
	 * <p>
	 * Adiciona um objeto do tipo {@code Convidado} ao conjunto de convidados,
	 * implementado usando a interface {@code Set}.
	 * </p>
	 * 
	 * @param nome          nome do convidado
	 * @param codigoConvite código do convite
	 * @return {@code true} se o elemento não existir no conjunto, false caso
	 *         contrário
	 */
	public boolean adicionarConvidado(String nome, int codigoConvite) {
		return this.convidados.add(new Convidado(nome, codigoConvite));
	}

	/**
	 * <p>
	 * Remove o objeto do tipo {@code Convidado} do conjunto
	 * {@code ConjuntoConvidados}.
	 * </p>
	 * 
	 * @param codigoConvite código do convite
	 * @return {@code true} se o conjunto tiver o elemento
	 */
	public boolean removerConvidadoPorCodigoConvite(int codigoConvite) {
		for (Convidado convidado : this.convidados) {
			if (convidado.getCodigoConvite() == codigoConvite) {
				return this.convidados.remove(convidado);
			}
		}
		return false;
	}

	/**
	 * <p>
	 * Retorna a quantidade de elementos no conjunto {@code ConjuntoConvidados}.
	 * </p>
	 * 
	 * @return a quantidade de elementos no conjunto
	 */
	public int contarConvidados() {
		return this.convidados.size();
	}

	/**
	 * <p>
	 * Retorna um conjunto de objetos do tipo {@code ConjuntoConvidados}.
	 * </p>
	 * 
	 * @return um conjunto de objetos
	 */
	public Set<Convidado> obterConvidados() {
		return this.convidados;
	}

}
