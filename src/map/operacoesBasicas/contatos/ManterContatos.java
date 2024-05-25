package map.operacoesBasicas.contatos;

public class ManterContatos {

	public static void main(String[] args) {
		AgendaContatos agendaContatos = new AgendaContatos();
		agendaContatos.adicionarContato("Douglas", "(61) 98549-7046");
		agendaContatos.adicionarContato("Douglas", "(61) 8549-7046");
		agendaContatos.pesquisarPorNome("Douglas");
		agendaContatos.removerContato("Ana");
		agendaContatos.removerContato("Douglas");
		agendaContatos.adicionarContato("Eduardo", "(61) 98885-5231");
		agendaContatos.adicionarContato("João", "(61) 98570-7556");
		agendaContatos.adicionarContato("Karoline", "(61) 3352-8935");
		agendaContatos.adicionarContato("Vanessa", "(61) 99594-2652");
		agendaContatos.adicionarContato("Rodrigo", "61995942652");
		agendaContatos.exibirContatos();
		agendaContatos.pesquisarPorNome("Karoline");
		agendaContatos.pesquisarPorNome("Vanessa");
	}

}
