package br.com.casadocodigo.produtos;

import br.com.casadocodigo.exceptions.AutorNuloException;
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
        if (autor == null) {
            throw new AutorNuloException("O autor do livro não pode ser nulo");
        }
        this.autor = autor;
    }

    public Livro(){
        this.isbn = "000-000-000-00-0";
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Exibindo detalhes do livro").append(System.lineSeparator());
        stringBuilder.append("Nome:").append(nome).append(System.lineSeparator());
        stringBuilder.append("Descrição: ").append(descricao).append(System.lineSeparator());
        stringBuilder.append("Valor: ").append(valor).append(System.lineSeparator());
        stringBuilder.append("ISBN: ").append(isbn).append(System.lineSeparator());
        stringBuilder.append(autor.toString()).append(System.lineSeparator());
        return stringBuilder.toString();
    }

    @Override
    public int compareTo(Produto produto) {
        return Double.compare(this.getValor(), produto.getValor());
    }
    /*
    Outra possível implementação do compareTo:
     public int compareTo(Produto produto) {
        return this.getValor() - produto.getValor();
    }
     */

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
