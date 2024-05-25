package set.pesquisa.contatos;

public class ManterContatos {

	public static void main(String[] args) {
		AgendaContatos agendaContatos = new AgendaContatos();
		agendaContatos.adicionarContato("Maria", "(61) 99592-5531");
		agendaContatos.adicionarContato("José", "(61) 99592-5531");
		agendaContatos.adicionarContato("José", "(61) 99592-5531");
		agendaContatos.adicionarContato("Andréia", "(61) 98925-1121");
		agendaContatos.adicionarContato("Kamilla", "(61) 99568-8231");
		agendaContatos.adicionarContato("Júlio", "(61) 8765-4439");
		agendaContatos.atualizarNumeroContato("Andréia", "(61) 98925-1121", "(61) 99592-5531");
		agendaContatos.exibirContatos();
		agendaContatos.pesquisarPorNome("Maria");
		agendaContatos.adicionarContato("Jonas", "3403-7754");
		agendaContatos.adicionarContato("Cleide", "(81) 98546-6556");
		agendaContatos.adicionarContato("Matheus", "(81) 98546-6556");
		agendaContatos.adicionarContato("Henrique", "(82a) 98546-6556");
		agendaContatos.exibirContatos();
	}

}
