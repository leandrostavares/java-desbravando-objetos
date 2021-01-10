package br.com.casadocodigo.teste;

import br.com.casadocodigo.livraria.Autor;

public class ComparacaoDeObjetos {

    public static void main(String[] args) {
        Autor autor1 = new Autor();
        autor1.setNome("Rodrigo");

        Autor autor2 = new Autor();
        autor2.setNome("Rodrigo");

        if (autor1.equals(autor2)) {
            System.out.println("Os autores são iguais");
        } else {
            System.out.println("Os Autores são diferentes");
        }

        Autor autor3 = new Autor();
        autor3.setNome("Stephen King");

        if (autor1.equals(autor3)) {
            System.out.println("Os autores são iguais");
        } else {
            System.out.println("Os Autores são diferentes");
        }
    }

}
