package br.com.casadocodigo.produtos;

import br.com.casadocodigo.produtos.interfaces.Produto;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Produto> produtos;

    public CarrinhoDeCompras() {
        this.produtos = new ArrayList<>();
    }

    public void adiciona(Produto produto) {
        this.produtos.add(produto);
    }

    public void remove(Produto produto) {
        this.produtos.remove((produto));
    }

    public double getValorTotalDaCompra() {
        double valorTotal = 0.0;
        for (Produto produto : produtos) {
            valorTotal += produto.getValor();
        }
        return valorTotal;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
}
