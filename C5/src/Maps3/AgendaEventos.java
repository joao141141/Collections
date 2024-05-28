package Maps3;

import java.util.HashMap;
import java.util.Map;
import java.time.LocalDate;
import java.util.TreeMap;
import java.util.Set;
import java.util.Collection;

public class AgendaEventos {

    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        Evento evento = new Evento(nome, atracao);
        eventosMap.put(data, Evento);
    }

    public void exibirAgenda() {
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventosTreeMap);
    }

    public void obterproximoevento() {
        /* Set<LocalDate> dateset = eventosMap.keySet();
        Collection<Evento> values = eventosMap.values();
         */

        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for (Map.Entry<LocalDate, Evento> entry : eventosMap.entrySet()) {
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento é: " + proximoEvento + " acontecerá na data" + proximoEvento);
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        agendaEventos.adicionarEvento(LocalDate.of(2023, 3, 26), "Formula 1: Australian Grand Prix", "Melbourne Grand Prix Circuit, Melbourne");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 5, 29), "Formula 1: Bahrain Grand Prix", "Bahrain International Circuit, Sakhir");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 6, 9), "Formula 1: Vietnam Grand Prix", "Hanoi Street Circuit, Hanoi");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 6, 23), "Formula 1: Chinese Grand Prix", "Shanghai International Circuit, Shanghai");
        agendaEventos.adicionarEvento(LocalDate.of(2024, 6, 30), "Formula 1: Dutch Grand Prix", "Circuit Zandvoort, Zandvoort");
    }

}
