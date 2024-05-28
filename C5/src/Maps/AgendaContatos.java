package Maps;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, int numero) {
        this.agendaContatoMap.put(nome, numero);
    }

    public void removerCOntato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos() {
        System.out.println("Contatos: " + agendaContatoMap);
    }

    public Integer pesquisarporNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        agenda.adicionarContato("Carlos Sainz", 1234567890);
        agenda.adicionarContato("Lewis Hamilton", 1234567891);
        agenda.adicionarContato("Max Verstappen", 1234567892);
        agenda.adicionarContato("Valtteri Bottas", 1234567893);
        agenda.adicionarContato("Lando Norris", 1234567894);
        agenda.adicionarContato("Sergio Perez", 1234567895);
        agenda.adicionarContato("Daniel Ricciardo", 1234567896);

        agenda.exibirContatos();
        agenda.removerCOntato("Carlos");
        agenda.exibirContatos();
        agenda.pesquisarporNome("Lewis Hamilton");
        agenda.exibirContatos();
    }
}
