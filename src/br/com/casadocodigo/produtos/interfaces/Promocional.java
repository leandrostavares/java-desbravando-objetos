package br.com.casadocodigo.produtos.interfaces;

@FunctionalInterface
public interface Promocional {

    boolean aplicaDescontoDe(double porcentagem);

    default boolean aplicaDescontoDe10PorCento() {
        return aplicaDescontoDe(0.1);
    }
}
