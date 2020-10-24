public class RegistroDeVendas {

    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("Mauricio Aniche");

        LivroFisico fisico = new LivroFisico(autor);
        fisico.setNome("Test-Driven Development");
        fisico.setValor(59.90);
        System.out.println("Valor do livro físico: " + fisico.getValor());
        if (fisico.aplicaDescontoDe10PorCento()) {
            System.out.println("Valor do livro físico com 10% de desconto: " + fisico.getValor());
        }

        Ebook ebook = new Ebook(autor);
        ebook.setNome("Test-Driven Development");
        ebook.setValor(29.90);

        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adiciona(fisico);
        carrinhoDeCompras.adiciona(ebook);

        System.out.println("Valor total da compra: " + carrinhoDeCompras.getValorTotalDaCompra());

    }
}
