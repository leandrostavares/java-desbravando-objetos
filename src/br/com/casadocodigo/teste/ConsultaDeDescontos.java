package br.com.casadocodigo.teste;
import br.com.casadocodigo.produtos.GerenciadorDeCupons;

public class ConsultaDeDescontos {

    public static void main(String[] args) {

        GerenciadorDeCupons gerenciadorDeCupons = new GerenciadorDeCupons();
        Double desconto = gerenciadorDeCupons.validaCupon("CUP158");
        if (desconto != null){
            System.out.println("Cupom de desconto válido: "+ desconto + "%");
        } else {
            System.out.println("Esse cupom não existe");
        }
    }

}
