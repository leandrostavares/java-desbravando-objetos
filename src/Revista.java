public class Revista implements Produto{

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

    @Override
    public double getValor() {
        return valor;
    }
}
