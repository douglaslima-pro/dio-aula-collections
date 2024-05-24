package list.ordenacao.pessoas;

import java.util.List;
import java.util.Locale;

public class ManterPessoas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.forLanguageTag("pt-BR"));

		OrdenacaoPessoas pessoas = new OrdenacaoPessoas();
		pessoas.adicionarPessoa("Ana", 28, 1.68);
		pessoas.adicionarPessoa("Carlos", 42, 1.80);
		pessoas.adicionarPessoa("Mariana", 20, 1.60);
		pessoas.adicionarPessoa("Pedro", 35, 1.75);
		pessoas.adicionarPessoa("Beatriz", 50, 1.70);
		pessoas.adicionarPessoa("Rafael", 29, 1.78);
		pessoas.adicionarPessoa("Juliana", 33, 1.65);
		pessoas.adicionarPessoa("Lucas", 24, 1.82);
		pessoas.adicionarPessoa("Patrícia", 39, 1.63);
		pessoas.adicionarPessoa("Gabriel", 27, 1.79);
		pessoas.adicionarPessoa("Fernanda", 45, 1.68);
		pessoas.adicionarPessoa("Diego", 31, 1.76);
		pessoas.adicionarPessoa("Amanda", 22, 1.72);
		pessoas.adicionarPessoa("Rodrigo", 38, 1.85);
		pessoas.adicionarPessoa("Isabela", 26, 1.67);
		pessoas.adicionarPessoa("Gustavo", 30, 1.74);
		pessoas.adicionarPessoa("Camila", 36, 1.69);
		pessoas.adicionarPessoa("José", 47, 1.73);
		pessoas.adicionarPessoa("Carolina", 23, 1.76);
		pessoas.adicionarPessoa("Marcos", 41, 1.81);

		List<Pessoa> listaDePessoas = pessoas.obterListaDePessoas();

		System.out.println();
		System.out.println("Ordem de inserção");
		exibirListaDePessoas(listaDePessoas);

		pessoas.ordenarPorIdade();
		listaDePessoas = pessoas.obterListaDePessoas();

		System.out.println();
		System.out.println("Lista ordenada por idade");
		exibirListaDePessoas(listaDePessoas);

		pessoas.ordenarPorAltura();
		listaDePessoas = pessoas.obterListaDePessoas();

		System.out.println();
		System.out.println("Lista ordenada por altura");
		exibirListaDePessoas(listaDePessoas);

	}

	public static void exibirListaDePessoas(List<Pessoa> listaDePessoas) {
		System.out.printf("%15s %15s %15s%n", "NOME", "IDADE", "ALTURA (M)");
		System.out.printf("%15s %15s %15s%n", "----", "-----", "----------");
		for (Pessoa pessoa : listaDePessoas) {
			System.out.printf("%15s %15d %15.2f%n", pessoa.getNome(), pessoa.getIdade(), pessoa.getAltura());
		}
	}

}
