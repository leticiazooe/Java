public class Principal {
	private Instituto instituto1;
	private Instituto instituto2;
	private Projeto projeto1;
	private Projeto projeto2;
	private Projeto projeto3;
	private Projeto projeto4;

    public static void main(String[] args) {
        Instituto instituto1 = new Instituto();
        instituto1.setNome("Instituto do amor");
        instituto1.setCidade("Monte Alto");

        Instituto instituto2 = new Instituto();
        instituto2.setNome("Instituto da Inteligenia");
        instituto2.setCidade("Jaboticabal");

        Projeto projeto1 = new Projeto();
        projeto1.setSigla("P1");
        projeto1.setNome("PAz e amor");
        projeto1.setOrcamento(100000.0);

        Projeto projeto2 = new Projeto();
        projeto2.setSigla("P2");
        projeto2.setNome("Ajude os AUmigos");
        projeto2.setOrcamento(75000.0);

        Projeto projeto3 = new Projeto();
        projeto3.setSigla("P3");
        projeto3.setNome("Doação de alimentos");
        projeto3.setOrcamento(125000.0);

        Projeto projeto4 = new Projeto();
        projeto4.setSigla("P4");
        projeto4.setNome("Outubro Rosa");
        projeto4.setOrcamento(552000.0);

        instituto1.setProjeto(new Projeto[]{projeto1, projeto2, projeto3});
        instituto2.setProjeto(new Projeto[]{projeto4});

        System.out.println("--*-- INSTITUTO 1 --*--");
        System.out.println("Nome: " + instituto1.getNome());
        System.out.println("Cidade: " + instituto1.getCidade());
        System.out.println("Projetos:");
        for (Projeto projeto : instituto1.getProjeto()) {
            System.out.println("Sigla: " + projeto.getSigla());
            System.out.println("Nome: " + projeto.getNome());
            System.out.println("Orçamento: " + projeto.getOrcamento());
            System.out.println();
        }

        System.out.println("--*-- INSTITUTO 2 --*--");
        System.out.println("Nome: " + instituto2.getNome());
        System.out.println("Cidade: " + instituto2.getCidade());
        System.out.println("Projetos:");
        for (Projeto projeto : instituto2.getProjeto()) {
            System.out.println("Sigla: " + projeto.getSigla());
            System.out.println("Nome: " + projeto.getNome());
            System.out.println("Orçamento: " + projeto.getOrcamento());
            System.out.println();
        }
    }

	public Instituto getInstituto1() {
		return instituto1;
	}

	public void setInstituto1(Instituto instituto1) {
		this.instituto1 = instituto1;
	}

	public Instituto getInstituto2() {
		return instituto2;
	}

	public void setInstituto2(Instituto instituto2) {
		this.instituto2 = instituto2;
	}

	public Projeto getProjeto1() {
		return projeto1;
	}

	public void setProjeto1(Projeto projeto1) {
		this.projeto1 = projeto1;
	}

	public Projeto getProjeto2() {
		return projeto2;
	}

	public void setProjeto2(Projeto projeto2) {
		this.projeto2 = projeto2;
	}

	public Projeto getProjeto3() {
		return projeto3;
	}

	public void setProjeto3(Projeto projeto3) {
		this.projeto3 = projeto3;
	}

	public Projeto getProjeto4() {
		return projeto4;
	}

	public void setProjeto4(Projeto projeto4) {
		this.projeto4 = projeto4;
	}
}