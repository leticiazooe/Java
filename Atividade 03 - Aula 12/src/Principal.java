public class Principal {

    private Funcionario funcionario;
    private Departamento departamento;
    private Relatorio relatorio1;
    private Relatorio relatorio2;
    
    public void entraDados() {
        departamento = new Departamento();
        departamento.setSigla("DPT123");
        departamento.setNome("Departamento de Exemplo");

        funcionario = new Funcionario();
        funcionario.setData("2023-10-22");
        funcionario.setCidade("Exemplo City");
        funcionario.setValor(1000.0);
        funcionario.setDepartamento(departamento);

        relatorio1 = new Relatorio();
        relatorio1.setData("2023-10-20");
        relatorio1.setTexto("Relatório 1");
        relatorio2 = new Relatorio();
        relatorio2.setData("2023-10-21");
        relatorio2.setTexto("Relatório 2");
 
        Relatorio[] relatoriosFuncionario = {relatorio1, relatorio2};
        funcionario.setRelatorio(relatoriosFuncionario);

    }
 
    public void mostraDados() {
        System.out.println("-------- FUNCIONÁRIO --------");
        System.out.println("Data: " + funcionario.getData());
        System.out.println("Cidade: " + funcionario.getCidade());
        System.out.println("Valor: " + funcionario.getValor());
        System.out.println("\nDepartamento associado ao Funcionário:");
        System.out.println("Sigla: " + funcionario.getDepartamento().getSigla());
        System.out.println("Nome: " + funcionario.getDepartamento().getNome());
        System.out.println("\nRelatórios associados ao Funcionário:");
        for (Relatorio relatorio : funcionario.getRelatorio()) {
            System.out.println("Data do Relatório: " + relatorio.getData());
            System.out.println("Texto do Relatório: " + relatorio.getTexto());
            System.out.println(); 
        }
    }
 
    public static void main(String[] args) {
        Principal p = new Principal();
        p.entraDados();
        p.mostraDados();

    }
}
