package br.com.casadocodigo.teste;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.produtos.CarrinhoDeCompras;
import br.com.casadocodigo.produtos.Ebook;
import br.com.casadocodigo.produtos.LivroFisico;
import br.com.casadocodigo.produtos.interfaces.Produto;
import java.util.List;

public class RegistroDeVendas {

    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.setNome("Mauricio Aniche");

        LivroFisico fisico = new LivroFisico(autor);
        fisico.setNome("Test-Driven Development");
        fisico.setValor(59.90);

        fisico.aplicaDescontoDe10PorCento();

        Ebook ebook = new Ebook(autor);
        ebook.setNome("Test-Driven Development");
        ebook.setValor(29.90);

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adiciona(fisico);
        carrinhoDeCompras.adiciona(ebook);

        System.out.println("listando produtos");
        List<Produto> produtos = carrinhoDeCompras.getProdutos();
        //Iteração mais segura evitando algumas possíveis exceptions do array
        for (Produto produto : produtos) {
            if (produto != null) {
                System.out.println(produto.getClass().getSimpleName() + " " + produto.getValor());
            }
        }
        System.out.println("Valor total da compra: " + carrinhoDeCompras.getValorTotalDaCompra());

    }
}
