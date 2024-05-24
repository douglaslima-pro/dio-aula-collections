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
	 * Adiciona um objeto do tipo {@code Convidado} ao conjunto
	 * {@code ConjuntoConvidados}.
	 * </p>
	 * 
	 * @param nome          nome do convidado
	 * @param codigoConvite código do convite
	 */
	public void adicionarConvidado(String nome, int codigoConvite) {
		Convidado convidado = new Convidado(nome, codigoConvite);
		if (!this.convidados.add(convidado)) {
			System.out.println();
			System.out.println(convidado.toString());
			System.out.println("Já existe um convidado com esse código de convite!");
		}
	}

	/**
	 * <p>
	 * Remove um objeto do tipo {@code Convidado} do conjunto
	 * {@code ConjuntoConvidados}.
	 * </p>
	 * 
	 * @param codigoConvite código do convite
	 * @return {@code true} se o objeto existir dentro do conjunto, false o
	 *         contrário
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
	 * Retorna um conjunto de objetos do tipo {@code Convidado} implementado usando
	 * a interface {@code Set}.
	 * </p>
	 * 
	 * @return um conjunto de objetos do tipo {@code Convidado}
	 */
	public Set<Convidado> obterConvidados() {
		return this.convidados;
	}

}