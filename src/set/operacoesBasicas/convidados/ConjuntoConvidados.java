package set.operacoesBasicas.convidados;

import java.util.Set;
import java.util.HashSet;

public class ConjuntoConvidados {

	private Set<Convidado> convidados;

	public ConjuntoConvidados() {
		this.convidados = new HashSet<>();
	}

	public void adicionarConvidado(String nome, int codigoConvite) {
		Convidado convidado = new Convidado(nome, codigoConvite);
		if (!this.convidados.add(convidado)) {
			System.out.println();
			System.out.println(convidado.toString());
			System.out.println("Já existe um convidado com esse código de convite!");
		}
	}

	public boolean removerConvidadoPorCodigoConvite(int codigoConvite) {
		for (Convidado convidado : this.convidados) {
			if (convidado.getCodigoConvite() == codigoConvite) {
				return this.convidados.remove(convidado);
			}
		}
		return false;
	}

	public int contarConvidados() {
		return this.convidados.size();
	}

	public Set<Convidado> obterConvidados() {
		return this.convidados;
	}

}