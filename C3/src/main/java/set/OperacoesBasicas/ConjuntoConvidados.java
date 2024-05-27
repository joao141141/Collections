package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadosSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadosSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadosSet.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return convidadosSet.size();
    }

    public void exibirConvidados() {
        System.out.println("Convidados: " + convidadosSet.toString());
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set de convidados.");

        conjuntoConvidados.adicionarConvidado("Carlos", 01);
        conjuntoConvidados.adicionarConvidado("Maria", 02);
        conjuntoConvidados.adicionarConvidado("João", 03);
        conjuntoConvidados.adicionarConvidado("Ana", 04);
        conjuntoConvidados.adicionarConvidado("Pedro", 05);
        conjuntoConvidados.adicionarConvidado("Ana", 06);
        conjuntoConvidados.exibirConvidados();
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set de convidados.");
        conjuntoConvidados.removerConvidadoPorCodigoConvite(01);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do Set de convidados.");
        conjuntoConvidados.exibirConvidados();

    }
}
