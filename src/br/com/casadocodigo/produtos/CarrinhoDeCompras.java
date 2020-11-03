package br.com.casadocodigo.produtos;

import br.com.casadocodigo.produtos.interfaces.Produto;

public class CarrinhoDeCompras {

    private Produto[] produtos = new Produto[10];
    private int contador = 0;
    private double valorTotalDaCompra;

    public void adiciona(Produto produto) {
        System.out.println("Adicionando produto: " + produto);
        this.produtos[contador] = produto;
        this.contador++;
        this.valorTotalDaCompra += produto.getValor();
    }

    public double getValorTotalDaCompra() {
        return valorTotalDaCompra;
    }

    public Produto[] getProdutos() {
        return produtos;
    }
}
