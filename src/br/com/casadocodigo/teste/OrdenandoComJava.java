package br.com.casadocodigo.teste;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.produtos.LivroFisico;
import br.com.casadocodigo.produtos.Ebook;
import br.com.casadocodigo.produtos.interfaces.Produto;


public class OrdenandoComJava {

    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("Rodrigo Turini");

        LivroFisico livroFisico = new LivroFisico(autor);
        livroFisico.setNome("Desbravando Java");
        livroFisico.setValor(60.0);

        Ebook ebook = new Ebook(autor);
        ebook.setNome("Apredendo JPA");
        ebook.setValor(10);

        List<Produto> produtos =  Arrays.asList(livroFisico,ebook);

        for (Produto produto : produtos) {
            System.out.println(produto.getValor());
        }

        Collections.sort(produtos);
        for (Produto produto : produtos) {
            System.out.println(produto.getValor());
        }
    }


}
