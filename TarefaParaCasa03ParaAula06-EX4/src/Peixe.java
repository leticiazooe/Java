public class Peixe extends AnimalMarinho {
    private String tipo;
    public Peixe(String nome, String tipo) {
        super(nome);
        this.tipo = tipo;
    }
    @Override
    public String emitirSom() {
        return "O peixe faz bolhas d'água e não emite som";
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}