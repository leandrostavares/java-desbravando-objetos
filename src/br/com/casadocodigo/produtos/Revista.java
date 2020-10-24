package br.com.casadocodigo.produtos;

import br.com.casadocodigo.livraria.Editora;
import br.com.casadocodigo.produtos.interfaces.Produto;
import br.com.casadocodigo.produtos.interfaces.Promocional;

public class Revista implements Produto, Promocional {

    private String nome;
    private String descricao;
    private double valor;
    private Editora editora;

    public Revista(String nome, String descricao, double valor, Editora editora) {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.editora = editora;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public double getValor() {
        return valor;
    }

    @Override
    public boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem > 0.01) {
            return false;
        }
        double desconto = getValor() * porcentagem;
        setValor(getValor() - desconto);
        return true;
    }
}
