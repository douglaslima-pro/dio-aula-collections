package set.operacoesBasicas.convidados;

import java.util.Set;
<<<<<<< HEAD
import java.util.Iterator;
=======
import java.util.Locale;
>>>>>>> 3fb49953bcdc6167f38285407008f718be7f2f9b

public class ManterConvidados {

	public static void main(String[] args) {
<<<<<<< HEAD
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
=======
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
>>>>>>> 3fb49953bcdc6167f38285407008f718be7f2f9b
		System.out.println();
		System.out.println("Programa encerrado.");
	}

<<<<<<< HEAD
	public static void exibirConjuntoConvidados(ConjuntoConvidados conjuntoConvidados) {
		Set<Convidado> convidados = conjuntoConvidados.obterConvidados();
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
=======
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
>>>>>>> 3fb49953bcdc6167f38285407008f718be7f2f9b
	}

}
