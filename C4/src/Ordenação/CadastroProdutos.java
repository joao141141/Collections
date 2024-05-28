package Ordenação;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos implements Comparable<Produto> {

    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutoPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastro = new CadastroProdutos();

        cadastro.adicionarProduto(01, "Limão", 12.50, 150);
        cadastro.adicionarProduto(02, "Laranja", 10.50, 100);
        cadastro.adicionarProduto(03, "Maçã", 15.50, 200);
        cadastro.adicionarProduto(04, "Banana", 8.50, 50);
        cadastro.adicionarProduto(05, "Uva", 20.50, 300);
        cadastro.adicionarProduto(06, "Pera", 18.50, 250);

        System.out.println("Produtos por nome: " + cadastro.exibirProdutosPorNome());

        System.out.println("Produtos por preço: " + cadastro.exibirProdutoPorPreco());

    }

    @Override
    public int compareTo(Produto o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
