package list.operacoesBasicas;

import java.util.List;
import java.util.Scanner;
import java.util.Locale;

public class ManterCarrinhoDeCompras {

	public static void main(String[] args) {
		Locale.setDefault(Locale.of("pt", "BR"));
		Scanner scanner = new Scanner(System.in);

		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

		System.out.println("CARRINHO DE COMPRAS");
		int opcao;
		do {

			System.out.println();
			System.out.println("1. Adicionar item");
			System.out.println("2. Remover item");
			System.out.println("3. Exibir itens");
			System.out.println("4. Sair");
			System.out.println();
			System.out.print("Digite o número da sua opção: ");
			opcao = scanner.nextInt();
			scanner.nextLine(); // limpa o buffer

			// Variáveis
			String nome;
			double preco;
			int quantidade;

			switch (opcao) {
			
			case 1:
				System.out.println();
				System.out.print("Digite o nome do item: ");
				nome = scanner.nextLine();
				System.out.print("Digite o preço do item: R$ ");
				preco = scanner.nextDouble();
				System.out.print("Digite a quantidade do item: ");
				quantidade = scanner.nextInt();
				scanner.nextLine(); // limpa o buffer
				System.out.println();
				if (carrinhoDeCompras.adicionarItem(nome, preco, quantidade)) {
					System.out.println("O item foi ADICIONADO ao carrinho de compras!");
				} else {
					System.out.println("ERRO => Já existe item com esse nome!");
				}
				break;
				
			case 2:
				if (!carrinhoDeCompras.obterCarrinhoDeCompras().isEmpty()) {
					System.out.println();
					System.out.println("Digite o nome do item que deseja remover:");
					nome = scanner.nextLine();
					System.out.println();
					if (carrinhoDeCompras.removerItem(nome)) {
						System.out.println("O item foi REMOVIDO do carrinho de compras!");
					} else {
						System.out.println("ERRO => Item não existe!");
					}
				} else {
					System.out.println();
					System.out.println("Carrinho de compras vazio!");
				}
				break;
				
			case 3:
				List<Item> listaDeItens = carrinhoDeCompras.obterCarrinhoDeCompras();
				if (!listaDeItens.isEmpty()) {
					System.out.println();
					System.out.printf("%20s %20s %20s%n", "NOME", "PREÇO (R$)", "QUANTIDADE");
					System.out.printf("%20s %20s %20s%n", "----", "----------", "----------");
					for (Item i : listaDeItens) {
						System.out.printf("%20s %20.2f %20d%n", i.getNome(), i.getPreco(), i.getQuantidade());
					}
					System.out.println();
					System.out.printf("%20s %20.2f%n", "Valor total (R$)", carrinhoDeCompras.calcularValorTotal());
				} else {
					System.out.println();
					System.out.println("Carrinho de compras vazio!");
				}
				break;
				
			case 4:
				break;
				
			default:
				System.out.println();
				System.out.println("Opção inválida!");
			}

			System.out.println();
			System.out.println("Aperte ENTER para continuar...");
			scanner.nextLine();

		} while (opcao != 4);
		scanner.close();
		System.out.println();
		System.out.println("Programa encerrado.");
	}

}
