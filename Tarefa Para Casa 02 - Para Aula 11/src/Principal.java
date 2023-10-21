
public class Principal {
    Caminhao caminhao1;
    Tanque tanque1;
    Ganeleiro graneleiro1;

    public void entraDados() {
        caminhao1 = new Caminhao();
        caminhao1.setPlaca("aoh587");
        caminhao1.setCor("azul");
        caminhao1.setTara(100.5);
        caminhao1.setCombustivel(2500);

        tanque1 = new Tanque();
        tanque1.setPlaca("abc123");
        tanque1.setCor("amarelo");
        tanque1.setTara(5000.0);
        tanque1.setCombustivel(100.0);
        tanque1.setLitros(300.0);

        graneleiro1 = new Ganeleiro();
        graneleiro1.setPlaca("EXY587");
        graneleiro1.setCor("verde");
        graneleiro1.setTara(8000.0);
        graneleiro1.setCombustivel(100.0);
        graneleiro1.setVolume(5000.0);
        graneleiro1.setComprimento(100.0);
    }

    public void mostraDados() {
        System.out.println("--- CAMINHÃO ---");
        System.out.println("Placa: " + caminhao1.getPlaca());
        System.out.println("Cor: " + caminhao1.getCor());
        System.out.println("Tara: " + caminhao1.getTara());
        System.out.println("Combustível: " + caminhao1.getCombustivel());
        System.out.println("Peso: " + caminhao1.calculaPeso());

        System.out.println();

        System.out.println("--- TANQUE ---");
        System.out.println("Placa: " + tanque1.getPlaca());
        System.out.println("Cor: " + tanque1.getCor());
        System.out.println("Tara: " + tanque1.getTara());
        System.out.println("Combustível: " + tanque1.getCombustivel());
        System.out.println("Litros: " + tanque1.getLitros());
        System.out.println("Peso: " + tanque1.calculaPeso());

        System.out.println();

        System.out.println("---GANELEIRO ---");
        System.out.println("Placa: " + graneleiro1.getPlaca());
        System.out.println("Cor: " + graneleiro1.getCor());
        System.out.println("Tara: " + graneleiro1.getTara());
        System.out.println("Combustível: " + graneleiro1.getCombustivel());
        System.out.println("Volume: " + graneleiro1.getVolume());
        System.out.println("Comprimento: " + graneleiro1.getComprimento());
        System.out.println("Peso: " + graneleiro1.calculaPeso());
    }

    public static void main(String[] args) {
        Principal p = new Principal();
        p.entraDados();
        p.mostraDados();
    }
}
