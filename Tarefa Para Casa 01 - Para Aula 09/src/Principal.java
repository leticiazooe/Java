public class Principal {
	Departamento d1,d2;
	Administrativo a1;
	Terceirizado t1;
	
	public void entraDados() {
		d1 = new Departamento();
		d1.setNome("TI");
		d1.setNumero("um");
		d2 = new Departamento();
		d2.setNome("Logistica");
		d2.setNumero("dois");
		
		a1 = new Administrativo();
		a1.setCtps(13579);
		a1.setNome("Maria Regina da Silva");
		a1.setSalario(1582.45);
		a1.setAdicional(18.50);
		a1.setHorario(5);
		a1.setDepartamento(d2);
		
		t1 = new Terceirizado();
		t1.setCtps(246810);
		t1.setNome("Pedro Moreira");
		t1.setSalario(1890.85);
		t1.setDepartamento(d1);
		t1.setValorHora(25.50);
	}
	public void mostraDados() {
		System.out.println("\n----- Administrativo -----");
		System.out.println("Ctps: " + a1.getCtps());
		System.out.println("Nome: " + a1.getNome());
		System.out.println("Salario: " + a1.getSalario() + "reais");
		System.out.println("Adicional: " + a1.getAdicional());
		System.out.println("Horario: " + a1.getHorario()+ "horas");
		
		
		System.out.println("\n----- Administrativo - Departamento -----");
		System.out.println("Nome: " + a1.getDepartamento().getNome());
		System.out.println("Numero: " + a1.getDepartamento().getNumero());
		
		System.out.println("\n----- Terceirizado -----");
		System.out.println("Ctps: " + t1.getCtps());
		System.out.println("Nome: " + t1.getNome());
		System.out.println("Salario: " + t1.getSalario()+ "reais");
		System.out.println("Valor da hora: " + t1.getValorHora()+ "reais");
		
		System.out.println("\n----- Terceirizado - Departamento -----");
		System.out.println("Nome: " + t1.getDepartamento().getNome());
		System.out.println("Numero: " + t1.getDepartamento().getNumero());	
	}
	public static void main (String args[]) {
		Principal p = new Principal();
		p.entraDados();
		p.mostraDados();
	}
}