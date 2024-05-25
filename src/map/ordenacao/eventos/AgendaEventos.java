package map.ordenacao.eventos;

import java.time.LocalDate;
import java.util.Set;
import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;

public class AgendaEventos {

	private Map<LocalDate, Evento> eventos;

	public AgendaEventos() {
		this.eventos = new HashMap<>();
	}

	public void adicionarEvento(LocalDate data, String nome, String atracao) {
		System.out.println();
		if (!this.eventos.containsKey(data)) {
			Evento evento = new Evento(data, nome, atracao);
			this.eventos.put(data, evento);
			System.out.println("O evento foi adicionado à agenda!");
			System.out.println(evento);
		} else {
			System.out.println("ATT => Já existe um evento na data " + data + "!");
		}
	}

	public void exibirAgenda() {
		System.out.println();
		Map<LocalDate, Evento> eventosPorData = new TreeMap<>(this.eventos);
		System.out.println(eventosPorData);
	}

	public void obterProximoEvento() {
		System.out.println();
		if (!this.eventos.isEmpty()) {
			LocalDate dataAtual = LocalDate.now();
			/**
			 * <p>
			 * Armazena um Map de eventos ordenados por data.
			 * </p>
			 */
			Map<LocalDate, Evento> eventosPorData = new TreeMap<>(this.eventos);
			/**
			 * <p>
			 * Armazena um Set de entradas (chave-valor) do Map de eventos.
			 * </p>
			 */
			Set<Map.Entry<LocalDate, Evento>> eventosEntrySet = eventosPorData.entrySet();
			LocalDate dataProximoEvento = null;
			Evento proximoEvento = null;
			for (Map.Entry<LocalDate, Evento> eventoEntrySet : eventosEntrySet) {
				if (eventoEntrySet.getKey().isEqual(dataAtual) || eventoEntrySet.getKey().isAfter(dataAtual)) {
					dataProximoEvento = eventoEntrySet.getKey();
					proximoEvento = eventoEntrySet.getValue();
					break;
				}
			}
			System.out.println("O evento mais próximo ocorrerá na data " + dataProximoEvento);
			System.out.println(proximoEvento);
		} else {
			System.out.println("ATT => Agenda de eventos vazia!");
		}
	}

}
