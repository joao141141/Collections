package Maps2;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos() {
        System.out.println("Produtos em estoque: " + estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                valorTotalEstoque += p.getPreco() * p.getQuantidade();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();
        estoque.adicionarProduto(1, "Arroz", 100, 5.0);
        estoque.adicionarProduto(2, "Feijão", 150, 6.0);
        estoque.adicionarProduto(3, "Açúcar", 200, 4.0);
        estoque.adicionarProduto(4, "Sal", 250, 3.0);
        estoque.adicionarProduto(5, "Óleo", 300, 7.0);
        estoque.adicionarProduto(6, "Farinha", 350, 2.0);
        estoque.adicionarProduto(7, "Café", 400, 8.0);
        estoque.adicionarProduto(8, "Leite", 450, 6.5);
        estoque.adicionarProduto(9, "Ovos", 500, 10.0);
        estoque.adicionarProduto(10, "Carne", 550, 20.0);
        estoque.exibirProdutos();
        System.out.println("Valor total do estoque: " + estoque.calcularValorTotalEstoque());
        System.out.println("Produto mais caro: " + estoque.obterProdutoMaisCaro());
    }
}
