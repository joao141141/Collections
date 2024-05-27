package Ordenação;

import java.util.Comparator;
import java.util.Objects;

public class Produto implements Comparable<Produto> {

    private String nome;
    private long codigo;
    private double preco;
    private int quantidade;

    public Produto(long codigo, String nome, double preco, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public long getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQUantidade() {
        return quantidade;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigo());
    }

    @Override
    public boolean equals(Object o) {
        if (this == null) {
            return true;
        }
        if (!(o instanceof Produto produto)) {
            return false;
        }
        return getCodigo() == produto.getCodigo();
    }

    @Override
    public String toString() {
        return "Produto: " + nome + " Código: " + codigo + " Preço: " + preco + " Quantidade: " + quantidade;
    }

    @Override
    public int compareTo(Produto p) {
        return nome.compareTo(p.getNome());
    }

}

class ComparatorPorPreco implements Comparator<Produto> {

    @Override
    public int compare(Produto p1, Produto p2) {
        return Double.compare(p1.getPreco(), p2.getPreco());
    }
}
