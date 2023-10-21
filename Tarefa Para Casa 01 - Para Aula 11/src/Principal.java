
public class Principal {
	private Documento doc;
	private NotaFiscal nota;
	private Orcamento orc;

	 public void entraDados() {
     doc = new Documento();
     doc.setData("10-02-2020");
     doc.setJuros(50);
     doc.setNumero(20);
     doc.setValor(1000);
     
     nota = new NotaFiscal();
     nota.setAcrescimo(60);
     nota.setData("25-06-2021");
     nota.setDesconto(20);
     nota.setJuros(12);
     nota.setNumero(35);
     nota.setValor(1200);
     
     orc = new Orcamento();
     orc.setData("05-08-2022");
     orc.setJuros(30);
     orc.setMaodeobra(120);
     orc.setNumero(50);
     orc.setPecas(85);
     orc.setValor(3500);
    	 
     }
	 
	 public void mostraDados() {
		 
     System.out.println("\n--- DOCUMENTO ---");
	 System.out.println("Data: " + doc.getData());
	 System.out.println("Juros: " + doc.getJuros());
	 System.out.println("Numero: " + doc.getNumero());
	 System.out.println("Valor: " + doc.getValor());
	     
	 System.out.println("\n--- NOTA FISCAL ---");
	 System.out.println("Data: " + nota.getData());
	 System.out.println("Juros: " + nota.getJuros());
	 System.out.println("Numero: " + nota.getNumero());
	 System.out.println("Valor: " + nota.getValor());
	 System.out.println("Acrescimo: " + nota.getAcrescimo());
	 System.out.println("Desconto: " + nota.getDesconto());
	     
	 System.out.println("\n--- ORCAMENTO ---");
	 System.out.println("Data: " + orc.getData());
	 System.out.println("Juros: " + orc.getJuros());
	 System.out.println("Numero: " + orc.getNumero());
	 System.out.println("Valor: " + orc.getValor());
	 System.out.println("Pecas: " + orc.getPecas());
	 System.out.println("Mão de obra: " + orc.getMaodeobra());
	     
	 }

	 public static void main(String args[]) {
	        Principal p = new Principal();
	        p.entraDados();
	        p.mostraDados();
	    }
	}
