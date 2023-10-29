public class Principal {
    private Componente componente1;
    private Componente componente2;
    private Peca peca;
    private Projeto projeto1;
    private Projeto projeto2;

    public void entraDados() {
        componente1 = new Componente();
        componente1.setId(1);
        componente1.setNome("Componente 1");
        componente1.setPreco(12.50);

        componente2 = new Componente();
        componente2.setId(2);
        componente2.setNome("Componente 2");
        componente2.setPreco(8.20);

        projeto1 = new Projeto();
        projeto1.setSigla("PRJ001");
        projeto1.setNome("Projeto Integrador 1");

        projeto2 = new Projeto();
        projeto2.setSigla("PRJ002");
        projeto2.setNome("Projeto 2 - Aula de POO");

        peca = new Peca();
        peca.setId("PECA001");
        peca.setNome("Peça 01");
        peca.setEspecificacao("Peça feita de borracha, "
        + "para janelas de carros");
        peca.setComponente(new Componente[]{componente1, componente2});
        peca.setProjeto(projeto1); 
    }

    public void mostraDados() {
        System.out.println("----*---- PEÇA ----*----");
        System.out.println("ID da Peça: " + peca.getId());
        System.out.println("Nome da Peça: " + peca.getNome());
        System.out.println("Especificação da Peça: " + peca.getEspecificacao());
        System.out.println("Projeto associado à Peça:");
        System.out.println("Sigla do Projeto: " + peca.getProjeto().getSigla());
        System.out.println("Nome do Projeto: " + peca.getProjeto().getNome());

        System.out.println("\n----*---- COMPONENTES DA PEÇA ----*----");
        for (Componente componente : peca.getComponente()) {
            System.out.println("ID do Componente: " + componente.getId());
            System.out.println("Nome do Componente: " + componente.getNome());
            System.out.println("Preço do Componente: " + componente.getPreco());
            System.out.println();
        }
        System.out.println("----------------------------");
    }

    public static void main(String[] args) {
        Principal p = new Principal();
        p.entraDados();
        p.mostraDados();
    }
}
