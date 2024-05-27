package lista.ordenacao;

import java.util.Comparator;

public class Pessoa implements Comparable<Pessoa> {

    private String nome;
    private int idade;
    private double altura;

    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;

    }

    public String toString() {
        return "Nome: " + this.nome + " Idade: " + this.idade + " Altura: " + this.altura;
    }

    public int getIdade() {
        return this.idade;
    }

    public int compareTo(Pessoa pessoa) {
        return Integer.compare(this.idade, pessoa.getIdade());
    }

    public Double getAltura() {
        return this.altura;
    }

    public String getNome() {
        return this.nome;
    }

}

class ComparatorPorAltura implements Comparator<Pessoa> {

    @Override
    public int compare(Pessoa p1, Pessoa p2) {
        return Double.compare(p1.getAltura(), p2.getAltura());
    }

}
