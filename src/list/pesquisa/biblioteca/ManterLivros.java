package list.pesquisa.biblioteca;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Locale;

public class ManterLivros {

	public static void main(String[] args) {
		Locale.setDefault(Locale.of("pt", "BR"));
		Scanner scanner = new Scanner(System.in);

		CatalogoLivros catalogoLivros = new CatalogoLivros();

		System.out.println("CATÁLOGO DE LIVROS");
		int opcao;

		do {

			System.out.println();
			System.out.println("1. Adicionar um livro");
			System.out.println("2. Pesquisar livro por autor");
			System.out.println("3. Pesquisar livro por intervalo de ano de publicação");
			System.out.println("4. Pesquisar livro por título");
			System.out.println("5. Exibir catálogo de livros");
			System.out.println("6. Sair");
			System.out.println();
			System.out.print("Digite o número da sua opção: ");
			opcao = scanner.nextInt();
			scanner.nextLine(); // limpa o buffer

			// variáveis
			String titulo;
			String autor;
			int anoDePublicacao;
			List<Livro> listaDeLivros;

			switch (opcao) {

			case 1:
				System.out.println();
				System.out.print("Digite o título do livro: ");
				titulo = scanner.nextLine();
				System.out.print("Digite o nome do autor: ");
				autor = scanner.nextLine();
				System.out.print("Digite o ano de publicação: ");
				anoDePublicacao = scanner.nextInt();
				scanner.nextLine(); // limpa o buffer
				if (catalogoLivros.adicionarLivro(titulo, autor, anoDePublicacao)) {
					System.out.println();
					System.out.println("Livro adicionado ao catálogo!");
				} else {
					System.out.println();
					System.out.println("ERRO => Não foi possível adicionar o livro ao catálogo! Tente novamente!");
				}
				break;

			case 2:
				System.out.println();
				System.out.print("Digite o nome do autor: ");
				autor = scanner.nextLine();
				listaDeLivros = catalogoLivros.pesquisarPorAutor(autor);
				if (!listaDeLivros.isEmpty()) {
					exibirListaDeLivros(listaDeLivros);
				} else {
					System.out.println();
					System.out.println("A pesquisa retornou nada!");
				}
				break;

			case 3:
				System.out.println();
				System.out.print("Digite o ano de início: ");
				int anoInicial = scanner.nextInt();
				scanner.nextLine(); // limpa o buffer
				System.out.print("Digite o ano de fim: ");
				int anoFinal = scanner.nextInt();
				scanner.nextLine(); // limpa o buffer
				listaDeLivros = catalogoLivros.pesquisarPorIntervaloAnos(anoInicial, anoFinal);
				if (!listaDeLivros.isEmpty()) {
					exibirListaDeLivros(listaDeLivros);
				} else {
					System.out.println();
					System.out.println("A pesquisa retornou nada!");
				}
				break;

			case 4:
				System.out.println();
				System.out.print("Digite o título do livro: ");
				titulo = scanner.nextLine();
				listaDeLivros = new ArrayList<>();
				listaDeLivros.add(catalogoLivros.pesquisarPorTitulo(titulo));
				if (listaDeLivros.get(0) != null) {
					exibirListaDeLivros(listaDeLivros);
				} else {
					System.out.println();
					System.out.println("A pesquisa retornou nada!");
				}
				break;

			case 5:
				listaDeLivros = catalogoLivros.pesquisarLivros();
				if (!listaDeLivros.isEmpty()) {
					exibirListaDeLivros(listaDeLivros);
				} else {
					System.out.println();
					System.out.println("Catálogo vazio!");
				}
				break;

			case 6:
				break;

			default:
				System.out.println();
				System.out.println("Opção inválida!");

			}

			System.out.println();
			System.out.println("Aperte ENTER para continuar...");
			scanner.nextLine();

		} while (opcao != 6);

		scanner.close();
		System.out.println();
		System.out.println("Programa encerrado.");
	}

	public static void exibirListaDeLivros(List<Livro> livros) {
		System.out.println();
		System.out.printf("%30s %30s %30s%n", "TÍTULO", "AUTOR", "ANO DE PUBLICAÇÃO");
		System.out.printf("%30s %30s %30s%n", "------", "-----", "-----------------");
		for (Livro l : livros) {
			System.out.printf("%30s %30s %30d%n", l.getTitulo(), l.getAutor(), l.getAnoDePublicacao());
		}
	}

}