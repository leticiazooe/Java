public class MamiferoMarinho extends AnimalMarinho {
    private String especie;
    public MamiferoMarinho(String nome, String especie) {
        super(nome);
        this.especie = especie;
    }
    @Override
    public String emitirSom() {
        return "O mamífero marinho emite sons característicos da espécie";
    }
    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
}