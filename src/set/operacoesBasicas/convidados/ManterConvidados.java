package set.operacoesBasicas.convidados;

import java.util.Set;
import java.util.Locale;

public class ManterConvidados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.forLanguageTag("pt-BR"));
		ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
		conjuntoConvidados.adicionarConvidado("Douglas", 12);
		conjuntoConvidados.adicionarConvidado("Beatriz", 3);
		conjuntoConvidados.adicionarConvidado("Laiz", 10);
		conjuntoConvidados.adicionarConvidado("Kaio", 11);
		System.out.println("Quantidade de convidados: " + conjuntoConvidados.contarConvidados());
		exibirConvidados(conjuntoConvidados.obterConvidados());
		conjuntoConvidados.removerConvidadoPorCodigoConvite(12);
		System.out.println();
		System.out.println("Quantidade de convidados: " + conjuntoConvidados.contarConvidados());
		exibirConvidados(conjuntoConvidados.obterConvidados());
		conjuntoConvidados.adicionarConvidado("Luís Guedes", 1);
		conjuntoConvidados.adicionarConvidado("Beatriz", 3);
		System.out.println();
		System.out.println("Quantidade de convidados: " + conjuntoConvidados.contarConvidados());
		exibirConvidados(conjuntoConvidados.obterConvidados());
		System.out.println();
		System.out.println("Programa encerrado.");
	}

	public static void exibirConvidados(Set<Convidado> convidados) {
		System.out.println();
		if (!convidados.isEmpty()) {
			System.out.printf("%15s %15s%n", "CONVITE", "NOME");
			System.out.printf("%15s %15s%n", "-------", "----");
			for (Convidado convidado : convidados) {
				System.out.printf("%15d %15s%n", convidado.getCodigoConvite(), convidado.getNome());
			}
		} else {
			System.out.println("Conjunto vazio!");
		}
	}

}
