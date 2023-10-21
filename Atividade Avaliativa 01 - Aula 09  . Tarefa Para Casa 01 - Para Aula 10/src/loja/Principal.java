package loja;

public class Principal {
	Cliente c1;
	
	
	public void entraDados() {
		c1 = new Cliente();
		c1.setCpf("458.180.697.15");
		c1.setNome("Joaquina Maria Soares");
	}
	
	public void mostraDados() {
		System.out.println("\n--- Dados do Cliente ---");
		System.out.println("\nCPF : " + c1.getCpf());
		System.out.println("Nome : " + c1.getNome());
		
	}
	
	public static void main (String args[]) {
		Principal p = new Principal();
		p.entraDados();
		p.mostraDados();
	}
}
