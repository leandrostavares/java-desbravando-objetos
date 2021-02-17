package br.com.casadocodigo.teste;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.produtos.Livro;
import br.com.casadocodigo.produtos.LivroFisico;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class NovidadesJava8 {

    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("Rodrigo Turini");

        Livro javaoo = new LivroFisico(autor);
        javaoo.setNome("Java 0.0.");

        Livro java8 = new LivroFisico(autor);
        java8.setNome("Java 8 prático");

        Livro ruby = new LivroFisico(autor);
        ruby.setNome("Livro de Ruby");

        List<Livro> livros = Arrays.asList(javaoo,java8,ruby);
        livros.sort(Comparator.comparing((Livro::getNome)));

        for (Livro livro : livros)  {
            System.out.println(livro.getNome());
        }
    }

}
