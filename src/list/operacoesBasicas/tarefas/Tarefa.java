package list.operacoesBasicas.tarefas;

public class Tarefa implements Comparable<Tarefa> {
	
	private String descricao;

	public Tarefa(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public int compareTo(Tarefa t) {
		return this.descricao.compareTo(t.descricao);
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}