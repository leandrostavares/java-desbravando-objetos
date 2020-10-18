public class RegrasDeDesconto {

    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.setNome("Rodrifo Turini");

        Livro livro = new LivroFisico(autor);
        livro.setValor(59.90);

        if (livro.aplicaDescontoDe(0.3)) {
            System.out.println("Valor do livro com desconto " + livro.getValor());
        } else {
            System.out.println("Desconto do livro não pode ser maior que 30%");
        }

        Ebook ebook = new Ebook(autor);
        ebook.setValor(100);

        if (ebook.aplicaDescontoDe(0.20)) {
            System.out.println("Valor do ebook com desconto " + ebook.getValor());
        } else {
            System.out.println("Desconto do ebook não pode ser maior que 15%");
        }
    }
}
