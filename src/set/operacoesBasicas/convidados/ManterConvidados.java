package set.operacoesBasicas.convidados;

import java.util.Set;
import java.util.Iterator;

public class ManterConvidados {

	public static void main(String[] args) {
		ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
		conjuntoConvidados.adicionarConvidado("Douglas", 12);
		conjuntoConvidados.adicionarConvidado("Elizabeth", 5);
		conjuntoConvidados.adicionarConvidado("Ana", 11);
		conjuntoConvidados.adicionarConvidado("Pedro", 8);
		conjuntoConvidados.adicionarConvidado("Marcos", 10);
		conjuntoConvidados.adicionarConvidado("Bethânia", 7);
		conjuntoConvidados.adicionarConvidado("Marilene", 9);
		conjuntoConvidados.adicionarConvidado("Kaio", 12);
		exibirConjuntoConvidados(conjuntoConvidados);
		conjuntoConvidados.removerConvidadoPorCodigoConvite(12);
		exibirConjuntoConvidados(conjuntoConvidados);
		conjuntoConvidados.removerConvidadoPorCodigoConvite(5);
		conjuntoConvidados.adicionarConvidado("Lucas", 7);
		exibirConjuntoConvidados(conjuntoConvidados);
		System.out.println();
		System.out.println("Programa encerrado.");
	}

	public static void exibirConjuntoConvidados(ConjuntoConvidados conjuntoConvidados) {
		Set<Convidado> convidados = conjuntoConvidados.obterConvidados();
		if (!convidados.isEmpty()) {
			Iterator<Convidado> convidadosIterator = convidados.iterator();
			System.out.println();
			System.out.printf("%10s %10s%n", "CONVITE", "NOME");
			System.out.printf("%10s %10s%n", "-------", "----");
			while (convidadosIterator.hasNext()) {
				Convidado convidado = convidadosIterator.next();
				System.out.printf("%10d %10s%n", convidado.getCodigoConvite(), convidado.getNome());
			}
			System.out.println();
			System.out.println("Existe(m) " + conjuntoConvidados.contarConvidados() + " convidado(s) neste conjunto!");
		} else {
			System.out.println();
			System.out.println("Conjunto vazio!");
		}
	}

}
