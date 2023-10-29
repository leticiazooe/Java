public class Principal {

    private Viagem viagem;
    private Passageiro passageiro1;
    private Passageiro passageiro2;
    private Passageiro passageiro3;
 
    public void entraDados() {
        viagem = new Viagem();
        viagem.setData("03-05-2023");
        viagem.setCidade("Monte Alto");
        viagem.setValor(100.0);
 
        passageiro1 = new Passageiro();
        passageiro1.setNome("Francisco Armando");
        passageiro1.setTelefone("1699874521");
        
        passageiro2 = new Passageiro();
        passageiro2.setNome("Aparecido Souza");
        passageiro2.setTelefone("32445687");
 
        passageiro3 = new Passageiro();
        passageiro3.setNome("Luisa Sonsa");
        passageiro3.setTelefone("6988745213");
 

        Passageiro[] passageirosDaViagem = {passageiro1, passageiro2, passageiro3};
        viagem.setPassageiro(passageirosDaViagem);

    }
 
    public void mostraDados() {

        System.out.println("--- VIAGEM ---");
        System.out.println("Data: " + viagem.getData());
        System.out.println("Cidade: " + viagem.getCidade());
        System.out.println("Valor: " + viagem.getValor());
        System.out.println("\nQuantidade dos passageiros da Viagem:");
        
        for (Passageiro passageiro : viagem.getPassageiro()) {
        System.out.println("Nome: " + passageiro.getNome());
        System.out.println("Telefone: " + passageiro.getTelefone());
        System.out.println(); }
    }
 
    public static void main(String[] args) {
        Principal p = new Principal();
        p.entraDados();
        p.mostraDados();

    }

}