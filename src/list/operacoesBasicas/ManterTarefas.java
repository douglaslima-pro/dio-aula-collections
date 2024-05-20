package list.operacoesBasicas;

import java.util.List;
import java.util.Scanner;
import java.util.Locale;

public class ManterTarefas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.of("pt", "BR"));
		Scanner scanner = new Scanner(System.in);
		ListaDeTarefas lista = new ListaDeTarefas();
		int opcao;
		do {
			System.out.println();
			System.out.println("1. Criar uma nova tarefa");
			System.out.println("2. Remover tarefa");
			System.out.println("3. Exibir tarefas");
			System.out.println("4. Sair");
			System.out.print("Digite o número da sua opção: ");
			opcao = scanner.nextInt();
			scanner.nextLine(); // limpa o buffer
			char confirmacao;
			switch (opcao) {
			case 1:
				System.out.println();
				System.out.println("Digite a descrição da tarefa:");
				String descricao = scanner.nextLine();
				if (descricao.equals("")) {
					System.out.println("Descrição vazia!");
				} else {
					System.out.println();
					System.out.print("Confirma a criação da tarefa? (S/N) ");
					confirmacao = scanner.next().charAt(0);
					scanner.nextLine(); // limpa o buffer
					if (confirmacao == 'S' || confirmacao == 's') {
						lista.adicionarTarefa(descricao);
						System.out.println();
						System.out.println("A tarefa foi criada com sucesso!");
					}
				}
				break;
			case 2:
				System.out.println();
				if (lista.listaVazia()) {
					System.out.println("Lista vazia!");
					break;
				}
				exibirTarefas(lista);
				System.out.print("Digite o número da tarefa que deseja remover: ");
				int indiceDaTarefa = scanner.nextInt() - 1;
				scanner.nextLine(); // limpa o buffer
				System.out.println();
				System.out.print("Confirma a remoção da tarefa? (S/N)");
				confirmacao = scanner.next().charAt(0);
				scanner.nextLine(); // limpa o buffer
				if (confirmacao == 'S' || confirmacao == 's') {
					if (lista.removerTarefa(indiceDaTarefa)) {
						System.out.println();
						System.out.println("A tarefa foi removida com sucesso!");
					} else {
						System.out.println();
						System.out.println("Número de tarefa inválido");
					}
				}
				break;
			case 3:
				System.out.println();
				if (lista.listaVazia()) {
					System.out.println("Lista vazia!");
					break;
				}
				exibirTarefas(lista);
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

	public static void exibirTarefas(ListaDeTarefas lista) {
		List<Tarefa> listaDeTarefas = lista.obterDescricoesTarefas();
		int index = 1;
		for (Tarefa tarefa : listaDeTarefas) {
			System.out.printf("TAREFA %d%n", index);
			System.out.println("---------------");
			System.out.println(tarefa.getDescricao());
			System.out.println();
			index++;
		}
	}

}
