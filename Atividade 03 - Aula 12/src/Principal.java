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
        relatorio1.setTexto("Relat�rio 1");
        relatorio2 = new Relatorio();
        relatorio2.setData("2023-10-21");
        relatorio2.setTexto("Relat�rio 2");
 
        Relatorio[] relatoriosFuncionario = {relatorio1, relatorio2};
        funcionario.setRelatorio(relatoriosFuncionario);

    }
 
    public void mostraDados() {
        System.out.println("-------- FUNCION�RIO --------");
        System.out.println("Data: " + funcionario.getData());
        System.out.println("Cidade: " + funcionario.getCidade());
        System.out.println("Valor: " + funcionario.getValor());
        System.out.println("\nDepartamento associado ao Funcion�rio:");
        System.out.println("Sigla: " + funcionario.getDepartamento().getSigla());
        System.out.println("Nome: " + funcionario.getDepartamento().getNome());
        System.out.println("\nRelat�rios associados ao Funcion�rio:");
        for (Relatorio relatorio : funcionario.getRelatorio()) {
            System.out.println("Data do Relat�rio: " + relatorio.getData());
            System.out.println("Texto do Relat�rio: " + relatorio.getTexto());
            System.out.println(); 
        }
    }
 
    public static void main(String[] args) {
        Principal p = new Principal();
        p.entraDados();
        p.mostraDados();

    }
}
