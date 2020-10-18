public class CarrinhoDeCompras {

    private double valorTotalDaCompra;

    public void adiciona(Livro livro) {
        System.out.println("Adicionando livro: " + livro);
        livro.aplicaDescontoDe(0.05);
        valorTotalDaCompra += livro.getValor();
    }

    public double getValorTotalDaCompra() {
        return valorTotalDaCompra;
    }

}
