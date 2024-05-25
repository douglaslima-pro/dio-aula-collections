package map.ordenacao.eventos;

import java.util.Locale;
import java.time.LocalDate;

public class ManterEventos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.forLanguageTag("pt-BR"));
		AgendaEventos agendaEventos = new AgendaEventos();
		agendaEventos.adicionarEvento(LocalDate.of(2024, 6, 1), "Dia aleatório", "N/A");
		agendaEventos.adicionarEvento(LocalDate.of(2024, 10, 12), "Dia das crianças", "Parque nicolândia");
		agendaEventos.adicionarEvento(LocalDate.of(2024, 12, 24), "Natal", "Ceia de natal");
		agendaEventos.adicionarEvento(LocalDate.of(2024, 10, 12), "Dia das crianças", "Parque nicolândia");
		agendaEventos.adicionarEvento(LocalDate.of(2024, 9, 7), "Independência do Brasil", "Impeachment do Lula");
		agendaEventos.adicionarEvento(LocalDate.of(2024, 1, 11), "Aniversário do Douglas", "Cinema no shopping");
		agendaEventos.exibirAgenda();
		agendaEventos.obterProximoEvento();
		agendaEventos.exibirAgenda();
	}

}
