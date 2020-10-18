public class CadastroDeLivros {

    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.setNome("Rodrigo turini");
        autor.setEmail("rodrigo.turini@caelum.com.br");
        autor.setCpf("123.456.789.10");

        LivroFisico livro = new LivroFisico(autor);
        livro.setNome("Java 8 prático");
        livro.setDescricao("Novos recursos da linguagem");
        livro.setValor(59.90);
        livro.setIsbn("978-34-24542-46-6");
        livro.mostrarDetalhes();

        if (!livro.aplicaDescontoDe(0.2)) {
            System.out.println("O desconto não pôde ser aplicado!");
        }

        Autor outroAutor = new Autor();
        outroAutor.setNome("Paulo Silveira");
        outroAutor.setEmail("paulo.silveira@caelum.com.br");
        outroAutor.setCpf("123.456.789.10");

        LivroFisico outroLivro = new LivroFisico(outroAutor);
        outroLivro.setNome("Lógica de programação");
        outroLivro.setDescricao("Crie seus primeiros programas");
        outroLivro.setValor(59.90);
        outroLivro.setIsbn("9768-85-66250-22-0");
        outroLivro.mostrarDetalhes();

        if (!outroLivro.aplicaDescontoDe(0.4)) {
            System.out.println("O desconto não pôde ser aplicado");
        }
    }

}
