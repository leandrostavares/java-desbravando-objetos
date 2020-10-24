package br.com.casadocodigo.produtos;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.produtos.interfaces.Promocional;

public class Ebook extends Livro implements Promocional {

    public Ebook(Autor autor) {
        super(autor);
    }

    @Override
    public boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem > 0.15) {
            return false;
        }
        double desconto = getValor() * porcentagem;
        setValor(getValor() - desconto);
        return true;
    }
}
