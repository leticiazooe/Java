import advogado.Cliente;
import casoscriminais.Relatorio;
import pessoa.Fisica;
import pessoa.Juridica;

public class Principal {
	Cliente c1,c2;
	Relatorio r1;
	Fisica f1;
	Juridica j1;
	
	public void entraDados() {
		c1 = new Cliente();
		c1.setCidade("Taquaritinga");
		c1.setEmail("anderson.oliveira@hotmail.com.br");
		c1.setRelatorio(r1);
		
		c2 = new Cliente();
		c2.setCidade("Matao");
		c2.setEmail("Mariaaparecida7@hotmail.com.br");
		c2.setRelatorio(r1);
		
	    r1 = new Relatorio();
	    r1.setOrdem("8759");
	    r1.setTexto("Relatorio de caso criminal");
	    
	    f1 = new Fisica();
	    f1.setCidade("Taquaritinga");
	    f1.setCliente(c1);
	    f1.setCpf("789.451.265.45");
	    f1.setEmail("camila.borges@hotmail.com.br");
	    f1.setNome("Anderson Oliveira");
	    f1.setRelatorio(r1);
	    
	    j1 = new Juridica();
	    j1.setCidade("Matao");
	    j1.setCliente(c2);
	    j1.setCnpj("09.972.067/0001-14");
	    j1.setEmail("joao.roberto.adv@hotmail.com");
	    j1.setRelatorio(r1);
		
	}

	public void mostraDados() {
	System.out.println("Cidade: " + c1.getCidade());
	System.out.println("Email: " + c1.getEmail());
	System.out.println("Relatorio: " + r1.getOrdem());
	System.out.println("Relatorio: " + r1.getTexto());
	System.out.println("Nome cliente: " + f1.getNome());
	System.out.println("CPF: " + f1.getCpf());
	
	
	
	}
	public static void main (String args[]) {
		Principal p = new Principal();
		p.entraDados();
		p.mostraDados();
	}
}
	