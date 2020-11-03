package br.com.casadocodigo.teste;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.produtos.CarrinhoDeCompras;
import br.com.casadocodigo.produtos.Ebook;
import br.com.casadocodigo.produtos.LivroFisico;
import br.com.casadocodigo.produtos.interfaces.Produto;
import com.sap.jvm.profiling.controller.action.HprofDumpAction;


public class RegistroDeVendas {

    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.setNome("Mauricio Aniche");

        LivroFisico fisico = new LivroFisico(autor);
        fisico.setNome("Test-Driven Development");
        fisico.setValor(59.90);
        System.out.println("Valor do livro físico: " + fisico.getValor());

        if (fisico.aplicaDescontoDe10PorCento()) {
            System.out.println("Valor do livro físico com 10% de desconto: " + fisico.getValor());
        }

        Ebook ebook = new Ebook(autor);
        ebook.setNome("Test-Driven Development");
        ebook.setValor(29.90);

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adiciona(fisico);
        carrinhoDeCompras.adiciona(ebook);

        Produto[] produtos = carrinhoDeCompras.getProdutos();

        System.out.println("listando valores dos produtos");

        // Forçando uma runtime exception no array
        for (int i=0; i<=produtos.length;i++) {
            try {
                if (produtos[i] != null) {
                    System.out.println(produtos[i].getValor());
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Índice inexistente: " + i);
            }
        }

        /*
        Tratando mais de uma possível exception, usando sintaxe do java 7 no catch
        Além disso está definido um bloco finally que vai executar independente se uma
        exception foi gerada
         */
        for (int i=0; i<=produtos.length;i++) {
            try {
                if (produtos[i] != null) {
                    System.out.println(produtos[i].getValor());
                }
            } catch (ArrayIndexOutOfBoundsException | NullPointerException e) {
                System.out.println("Ocorreu uma exceção mas não sei qual: " + i);
                e.printStackTrace();
            } finally {
                System.out.println("Sempre serei executado");
            }
        }

        //Iteração mais segura evitando algumas possíveis exceptions do array
        for (Produto produto : produtos) {
            if (produto != null) {
                System.out.println(produto.getValor());
            }
        }

        System.out.println("Valor total da compra: " + carrinhoDeCompras.getValorTotalDaCompra());

    }
}
