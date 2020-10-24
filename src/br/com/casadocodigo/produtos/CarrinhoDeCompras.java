package br.com.casadocodigo.produtos;

import br.com.casadocodigo.produtos.interfaces.Produto;

public class CarrinhoDeCompras {

    private double valorTotalDaCompra;

    public void adiciona(Produto produto) {
        System.out.println("Adicionando livro: " + produto);
        valorTotalDaCompra += produto.getValor();
    }

    public double getValorTotalDaCompra() {
        return valorTotalDaCompra;
    }

}
