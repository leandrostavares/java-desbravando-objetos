public class Ebook extends Livro {
    public Ebook(Autor autor) {
        super(autor);
    }

    @Override
    public boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem > 0.15) {
            return false;
        }
        this.valor -= this.valor * porcentagem;
        return true;
    }
}
