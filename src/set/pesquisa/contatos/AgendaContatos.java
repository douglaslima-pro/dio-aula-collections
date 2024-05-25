package set.pesquisa.contatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

	private Set<Contato> contatos;

	public AgendaContatos() {
		this.contatos = new HashSet<>();
	}

	public void adicionarContato(String nome, String telefone) {
		System.out.println();
		Contato contato = new Contato(nome, telefone);
		if (!Telefone.validarTelefone(telefone)) {
			System.out.println("ATT => Telefone inválido! Insira um telefone no formato: (xx) xxxxx-xxxx!");
			return;
		}
		if (this.contatos.add(contato)) {
			System.out.println("O contato foi adicionado na lista!");
			System.out.println(contato);
		} else {
			System.out.println("ATT => O telefone " + telefone + " já está em uso!");
			System.out.println(contato);
		}
	}

	public void exibirContatos() {
		System.out.println();
		if (!this.contatos.isEmpty()) {
			System.out.printf("%20s %20s%n", "NOME", "TELEFONE");
			System.out.printf("%20s %20s%n", "----", "--------");
			for (Contato contato : this.contatos) {
				System.out.printf("%20s %20s%n", contato.getNome(), contato.getTelefone());
			}
		} else {
			System.out.println("ATT => Lista de contatos vazia!");
		}
	}

	public void exibirContatos(Set<Contato> contatos) {
		System.out.println();
		if (!contatos.isEmpty()) {
			System.out.printf("%20s %20s%n", "NOME", "TELEFONE");
			System.out.printf("%20s %20s%n", "----", "--------");
			for (Contato contato : contatos) {
				System.out.printf("%20s %20s%n", contato.getNome(), contato.getTelefone());
			}
		} else {
			System.out.println("ATT => Lista de contatos vazia!");
		}
	}

	public void pesquisarPorNome(String nome) {
		System.out.println();
		System.out.println("Contatos que começam com o nome: '" + nome + "'.");
		Set<Contato> contatosPorNome = new HashSet<>();
		for (Contato contato : this.contatos) {
			if (contato.getNome().startsWith(nome)) {
				contatosPorNome.add(contato);
			}
		}
		if (!contatosPorNome.isEmpty()) {
			this.exibirContatos(contatosPorNome);
		} else {
			System.out.println("ATT => Não existem contatos que começam com o nome: '" + nome + "'!");
		}
	}

	public void atualizarNumeroContato(String nome, String telefoneAntigo, String telefoneNovo) {
		System.out.println();
		for (Contato contato : this.contatos) {
			if (contato.getTelefone().equalsIgnoreCase(telefoneAntigo)) {
				System.out.println("ATT => O telefone " + telefoneAntigo + " já está em uso!");
				return;
			}
		}
		for (Contato contato : this.contatos) {
			if (contato.getNome().equalsIgnoreCase(nome) && contato.getTelefone().equalsIgnoreCase(telefoneAntigo)) {
				contato.setTelefone(telefoneNovo);
				Contato contatoNovo = new Contato(nome, telefoneNovo);
				System.out.println("O telefone do contato foi atualizado!");
				System.out.println(contatoNovo);
			}
		}
		System.out.println("ATT => Não existe contato com esse nome e telefone!");
	}

}