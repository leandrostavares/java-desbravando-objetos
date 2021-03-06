package br.com.casadocodigo.livraria;


public class Autor {

    private String nome;
    private String email;
    private String cpf;

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Informações do autor").append(System.lineSeparator());
        stringBuilder.append("Nome: ").append(nome).append(System.lineSeparator());
        stringBuilder.append("E-mail: ").append(email).append(System.lineSeparator());
        stringBuilder.append("CPF: ").append(cpf).append(System.lineSeparator());
        return stringBuilder.toString();
    }

    @Override
    public boolean equals(Object obj){
        // Garantindo que não ocorra um ClassCastException
        if (!(obj instanceof Autor)){
            return false;
        }
        /*
        Chamando método "equals" da classe String através do atributo nome.
        Na clase string o "equals" é sobresrito para realizar comparação com
        outras strings (obj.nome)
        */
        return this.nome.equals(((Autor) obj).nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
