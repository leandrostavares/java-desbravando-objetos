package br.com.casadocodigo.produtos;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.produtos.interfaces.Produto;

public abstract class Livro implements Produto {

    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor;

    public Livro(Autor autor) {
        this(); // Calls the default constructor
        this.autor = autor;
    }

    public Livro(){
        this.isbn = "000-000-000-00-0";
    }

    public void mostrarDetalhes() {
        System.out.println("Exibindo detalhes do livro");
        System.out.println("Nome:" + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("ISBN: " + isbn);
        if (this.temAutor()){
            autor.mostrarDetalhes();
        }
        System.out.println("--");
    }

    public boolean temAutor(){
        return this.autor != null;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() { return valor; }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
}
