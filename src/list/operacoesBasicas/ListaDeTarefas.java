package list.operacoesBasicas;

import java.util.List;
import java.util.ArrayList;

/**
 * <p>
 * Crie uma classe chamada "ListaTarefas" que possui uma lista de tarefas como
 * atributo. Cada tarefa é representada por uma classe chamada "Tarefa" que
 * possui um atributo de descrição.
 * </p>
 * <p>
 * Implemente os seguintes métodos:
 * </p>
 * <ul>
 * <li><strong>adicionarTarefa(String descricao):</strong> Adiciona uma nova
 * tarefa à lista com a descrição fornecida.</li>
 * <li><strong>removerTarefa(String descricao):</strong> Remove uma tarefa da
 * lista com base em sua descrição.</li>
 * <li><strong>obterNumeroTotalTarefas():</strong> Retorna o número total de
 * tarefas na lista.</li>
 * <li><strong>obterDescricoesTarefas():</strong> Retorna uma lista contendo a
 * descrição de todas as tarefas na lista.</li>
 */
public class ListaDeTarefas {

	/**
	 * <p>
	 * Lista de tarefas.
	 * </p>
	 */
	private List<Tarefa> listaDeTarefas;

	public ListaDeTarefas() {
		this.listaDeTarefas = new ArrayList<Tarefa>();
	}

	/**
	 * <p>
	 * Adiciona uma nova tarefa à lista com a descrição fornecida.
	 * </p>
	 * 
	 * @param descricao descrição da tarefa
	 */
	public boolean adicionarTarefa(String descricao) {
		return this.listaDeTarefas.add(new Tarefa(descricao));
	}

	/**
	 * <p>
	 * Remove uma tarefa da lista com base em sua descrição.
	 * </p>
	 * 
	 * @param descricao descrição da tarefa
	 */
	public boolean removerTarefa(String descricao) {
		for (Tarefa tarefa : this.listaDeTarefas) {
			if (tarefa.getDescricao().compareTo(descricao) == 0) {
				return this.listaDeTarefas.remove(tarefa);
			}
		}
		return false;
	}

	/**
	 * <p>
	 * Retorna o número total de tarefas na lista.
	 * </p>
	 * 
	 * @return número total de tarefas na lista.
	 */
	public int obterNumeroTotalTarefas() {
		return this.listaDeTarefas.size();
	}

	/**
	 * <p>
	 * Retorna uma lista contendo a descrição de todas as tarefas na lista.
	 * </p>
	 * 
	 * @return uma lista contendo a descrição de todas as tarefas na lista
	 */
	public List<Tarefa> obterDescricoesTarefas() {
		return this.listaDeTarefas;
	}

	/**
	 * <p>
	 * Retorna uma tarefa com base no índice.
	 * </p>
	 * 
	 * @param indice posição da tarefa na lista
	 * @return uma tarefa com base no índice, ou null se não existir tarefa na posição do índice
	 */
	public Tarefa obterTarefaNoIndice(int indice) {
		try {
			return this.listaDeTarefas.get(indice);
		} catch (IndexOutOfBoundsException e) {
			return null;
		}
	}
}
