//aula do dia 09/10 - faltei. 

public class Principal {
	private Funcionario f1;
	private Vendedor v1;
	private Contador c1;

	public void entraDados() {
		f1 = new Funcionario();
		f1.setCtps(459871);
		f1.setNome("Leticia");
		f1.setSalario(5820);
		f1.setIr(300);

		v1 = new Vendedor();
		v1.setCtps(698214);
		v1.setNome("Joaquina");
		v1.setSalario(8740);
		v1.setIr(362);
		v1.setComissao(950);
		v1.setTotalVendas(60000);

		c1 = new Contador();
		c1.setCtps(158742);
		c1.setNome("Emanuela");
		c1.setSalario(6500);
		c1.setIr(500);
		c1.setAdicional(360);
	}

	public void mostraDados() {
		System.out.println("--- FUNCIONARIO ---");
		System.out.println("Nome: " + f1.getNome());
		System.out.println("CTPS: " + f1.getCtps());
		System.out.println("Salario: " + f1.getSalario());
		System.out.println("Imposto de Renda: " + f1.getIr());

		System.out.println();

		System.out.println("--- VENDEDOR ---");
		System.out.println("Nome: " + v1.getNome());
		System.out.println("CTPS: " + v1.getCtps());
		System.out.println("Salario: " + v1.getSalario());
		System.out.println("Imposto de Renda : " + v1.getIr());
		System.out.println("Comissao: " + v1.getComissao());
		System.out.println("Total de Vendas: " + v1.getTotalVendas());

		System.out.println();

		System.out.println("--- CONTADOR ---");
		System.out.println("Nome: " + c1.getNome());
		System.out.println("CTPS: " + c1.getCtps());
		System.out.println("Salario: " + c1.getSalario());
		System.out.println("Imposto de Renda: " + c1.getIr());
		System.out.println("Adicional: " + c1.getAdicional());
	}

	public static void main(String args[]) {
		 Principal p = new Principal();
		 p.entraDados();
		 p.mostraDados();
	}
}
