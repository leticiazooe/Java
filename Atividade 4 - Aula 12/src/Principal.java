public class Principal {
    private Equipamento equipamento;
    private Laboratorio laboratorio;
    private Peca peca1;
    private Peca peca2;
 
    public void entraDados() {
        // Criar e configurar objeto Laboratório
        laboratorio = new Laboratorio();
        laboratorio.setSigla("LAB123");
        laboratorio.setNome("Laboratório de Exemplo");
 
        // Criar e configurar objeto Equipamento
        equipamento = new Equipamento();
        equipamento.setId("EQUIP001");
        equipamento.setNome("Equipamento de Teste");
        equipamento.setModelo("Modelo 123");
        equipamento.setLaboratorio(laboratorio);
 
        // Criar e configurar objetos Peça
        peca1 = new Peca();
        peca1.setNumero(1);
        peca1.setNome("Peça 1");
        peca1.setPreco(10.0);
 
        peca2 = new Peca();
        peca2.setNumero(2);
        peca2.setNome("Peça 2");
        peca2.setPreco(15.0);
 
        // Definir as peças do equipamento
        Peca[] pecasEquipamento = {peca1, peca2};
        equipamento.setPeca(pecasEquipamento);
    }
 
    public void mostraDados() {
        System.out.println("-------- EQUIPAMENTO --------");
        System.out.println("ID: " + equipamento.getId());
        System.out.println("Nome: " + equipamento.getNome());
        System.out.println("Modelo: " + equipamento.getModelo());
 
        System.out.println("\nLaboratórios associados ao Equipamento:");
            System.out.println("Sigla: " + laboratorio.getSigla());
            System.out.println("Nome: " + laboratorio.getNome());

 
        System.out.println("\nPeças associadas ao Equipamento:");
        for (Peca peca : equipamento.getPeca()) {
            System.out.println("Número da Peça: " + peca.getNumero());
            System.out.println("Nome da Peça: " + peca.getNome());
            System.out.println("Preço da Peça: " + peca.getPreco());
            System.out.println();
        }
    }
 
    public static void main(String[] args) {
        Principal p = new Principal();
        p.entraDados();
        p.mostraDados();
    }
}