public class AnimalMarinho {
    private String nome;

    public AnimalMarinho(String nome) {
        this.nome = nome;
    }
    public String emitirSom() {
        return "O animal marinho emite um som desconhecido";
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
