package generics;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

import comparable_comparator.Pessoa;
import comparable_comparator.CompararIdade;
import comparable_comparator.CompararNomeIdadeEstado;

public class ExemploLista {

	public static void main(String[] args) {

		Pessoa douglas = new Pessoa("Douglas", 21, "DF");
		Pessoa eduarda = new Pessoa("Eduarda", 28, "SP");
		Pessoa joao = new Pessoa("Joao", 18, "PE");
		Pessoa pedro = new Pessoa("Pedro", 24, "RJ");
		Pessoa ana = new Pessoa("Ana", 31, "AM");
		Pessoa cecilia = new Pessoa("Cecilia", 21, "RS");
		Pessoa rubens = new Pessoa("Rubens", 20, "DF");
		Pessoa daniel = new Pessoa("Daniel", 19, "DF");
		Pessoa eduarda2 = new Pessoa("Eduarda", 28, "RJ");

		/**
		 * <p>
		 * Cria uma lista com elementos do tipo {@code Pessoa}.
		 * </p>
		 */
		List<Pessoa> pessoas = new ArrayList<>();
		pessoas.add(douglas);
		pessoas.add(eduarda);
		pessoas.add(joao);
		pessoas.add(pedro);
		pessoas.add(ana);
		pessoas.add(cecilia);
		pessoas.add(rubens);
		pessoas.add(daniel);
		pessoas.add(eduarda2);

		System.out.println("Ordem de inserção");
		System.out.printf("%10s %10s %10s%n","NOME","IDADE","ESTADO");
		System.out.printf("%10s %10s %10s%n","----","-----","------");
		for (Pessoa pessoa : pessoas) {
			System.out.printf("%10s %10d %10s%n", pessoa.getNome(), pessoa.getIdade(), pessoa.getEstado());
		}

		Collections.sort(pessoas);
		System.out.println();

		System.out.println("Ordem natural da lista");
		System.out.printf("%10s %10s %10s%n","NOME","IDADE","ESTADO");
		System.out.printf("%10s %10s %10s%n","----","-----","------");
		for (Pessoa pessoa : pessoas) {
			System.out.printf("%10s %10d %10s%n", pessoa.getNome(), pessoa.getIdade(), pessoa.getEstado());
		}

		Collections.reverse(pessoas);
		System.out.println();

		System.out.println("Ordem reversa baseada em nome");
		System.out.printf("%10s %10s %10s%n","NOME","IDADE","ESTADO");
		System.out.printf("%10s %10s %10s%n","----","-----","------");
		for (Pessoa pessoa : pessoas) {
			System.out.printf("%10s %10d %10s%n", pessoa.getNome(), pessoa.getIdade(), pessoa.getEstado());
		}

		Collections.sort(pessoas, new CompararIdade());
		System.out.println();

		System.out.println("Ordem baseada em idade:");
		System.out.printf("%10s %10s %10s%n","NOME","IDADE","ESTADO");
		System.out.printf("%10s %10s %10s%n","----","-----","------");
		for (Pessoa pessoa : pessoas) {
			System.out.printf("%10s %10d %10s%n", pessoa.getNome(), pessoa.getIdade(), pessoa.getEstado());
		}
		
		Collections.sort(pessoas, new CompararNomeIdadeEstado());
		System.out.println();

		System.out.println("Ordem baseada em nome, idade e estado:");
		System.out.printf("%10s %10s %10s%n","NOME","IDADE","ESTADO");
		System.out.printf("%10s %10s %10s%n","----","-----","------");
		for (Pessoa pessoa : pessoas) {
			System.out.printf("%10s %10d %10s%n", pessoa.getNome(), pessoa.getIdade(), pessoa.getEstado());
		}
	}

}