package main.java.set.OperacoesBasicas;

import java.util.Objects;

public class Convidado {

    private String nome;
    private final int codigoConvite;

    public Convidado(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoConvite() {
        return codigoConvite;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigoConvite());
    }

    @Override
    public String toString() {
        return "Nome: " + getNome() + " Codigo do Convite: " + getCodigoConvite();
    }

}
