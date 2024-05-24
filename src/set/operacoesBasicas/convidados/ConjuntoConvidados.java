package set.operacoesBasicas.convidados;

import java.util.Set;
import java.util.HashSet;

public class ConjuntoConvidados {

	private Set<Convidado> convidados;

<<<<<<< HEAD
=======
	/**
	 * <p>
	 * Cria um objeto do tipo {@code ConjuntoConvidados} que implementa a interface
	 * {@code Set}.
	 * </p>
	 */
>>>>>>> 3fb49953bcdc6167f38285407008f718be7f2f9b
	public ConjuntoConvidados() {
		this.convidados = new HashSet<>();
	}

<<<<<<< HEAD
	public void adicionarConvidado(String nome, int codigoConvite) {
		Convidado convidado = new Convidado(nome, codigoConvite);
		if (!this.convidados.add(convidado)) {
			System.out.println();
			System.out.println(convidado.toString());
			System.out.println("Já existe um convidado com esse código de convite!");
		}
	}

=======
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
>>>>>>> 3fb49953bcdc6167f38285407008f718be7f2f9b
	public boolean removerConvidadoPorCodigoConvite(int codigoConvite) {
		for (Convidado convidado : this.convidados) {
			if (convidado.getCodigoConvite() == codigoConvite) {
				return this.convidados.remove(convidado);
			}
		}
		return false;
	}

<<<<<<< HEAD
=======
	/**
	 * <p>
	 * Retorna a quantidade de elementos no conjunto {@code ConjuntoConvidados}.
	 * </p>
	 * 
	 * @return a quantidade de elementos no conjunto
	 */
>>>>>>> 3fb49953bcdc6167f38285407008f718be7f2f9b
	public int contarConvidados() {
		return this.convidados.size();
	}

<<<<<<< HEAD
=======
	/**
	 * <p>
	 * Retorna um conjunto de objetos do tipo {@code ConjuntoConvidados}.
	 * </p>
	 * 
	 * @return um conjunto de objetos
	 */
>>>>>>> 3fb49953bcdc6167f38285407008f718be7f2f9b
	public Set<Convidado> obterConvidados() {
		return this.convidados;
	}

<<<<<<< HEAD
}
=======
}
>>>>>>> 3fb49953bcdc6167f38285407008f718be7f2f9b
