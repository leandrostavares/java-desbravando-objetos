package br.com.casadocodigo.teste;
import br.com.casadocodigo.produtos.GerenciadorDeCupons;

public class ConsultaDeDescontos {

    public static void main(String[] args) {

        GerenciadorDeCupons gerenciadorDeCupons = new GerenciadorDeCupons();

        if (gerenciadorDeCupons.validaCupon("CUP1234")){
            System.out.println("Cupom de desconto válido");
        } else {
            System.out.println("Esse cupom não existe");
        }
    }

}
