package list.ordenacao.pessoas;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class OrdenacaoPessoas {

	private List<Pessoa> listaDePessoas;

	public OrdenacaoPessoas() {
		this.listaDePessoas = new ArrayList<>();
	}

	public boolean adicionarPessoa(String nome, int idade, double altura) {
		return this.listaDePessoas.add(new Pessoa(nome, idade, altura));
	}

	public void ordenarPorIdade() {
		Collections.sort(this.listaDePessoas, new OrdenarPessoaPorIdade());
	}

	public void ordenarPorAltura() {
		Collections.sort(this.listaDePessoas, new OrdenarPessoaPorAltura());
	}

	public List<Pessoa> obterListaDePessoas() {
		return this.listaDePessoas;
	}

}
