package map.operacoesBasicas.contatos;

import java.util.Map;
import java.util.HashMap;

public class AgendaContatos {

	private Map<String, String> contatos;

	public AgendaContatos() {
		this.contatos = new HashMap<>();
	}

	public void adicionarContato(String nome, String telefone) {
		System.out.println();
		if (!Telefone.validarTelefone(telefone)) {
			System.out.println("ATT => Telefone inválido! Insira um telefone no formato: (xx) xxxxx-xxxx!");
			return;
		}
		if (!this.contatos.containsKey(nome)) {
			this.contatos.put(nome, telefone);
			System.out.println("O contato foi adicionado à lista!");
			System.out.println("'" + nome + "' : " + this.contatos.get(nome));
		} else {
			System.out.println("ATT => O nome '" + nome + "' já existe!");
		}
	}

	public void removerContato(String nome) {
		System.out.println();
		if (this.contatos.isEmpty()) {
			System.out.println("ATT => Lista de contatos vazia!");
			return;
		}
		String telefone = this.contatos.remove(nome);
		if (telefone != null) {
			System.out.println("O contato foi removido da lista!");
			System.out.println("'" + nome + "' : " + telefone);
		} else {
			System.out.println("ATT => O contato '" + nome + "' não existe!");
		}
	}
	
	public void exibirContatos() {
		System.out.println();
		if (this.contatos.isEmpty()) {
			System.out.println("ATT => Lista de contatos vazia!");
			return;
		}
		System.out.println(this.contatos);
	}

	public void pesquisarPorNome(String nome) {
		System.out.println();
		if (this.contatos.containsKey(nome)) {
			System.out.printf("Contato{nome='%s', telefone=%s}%n", nome, this.contatos.get(nome));
		} else {
			System.out.println("ATT => Não existe contato com esse nome!");
		}
	}

}
