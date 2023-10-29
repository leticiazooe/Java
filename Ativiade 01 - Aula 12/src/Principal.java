public class Principal {
 Veiculo v1,v2;
 Vendedor ve1;

	public void entraDados() {

		v1 = new Veiculo();
		v1.setAno(2008);
		v1.setPlaca("MKI458");
		v1.setValor(78000);
		
		v2 = new Veiculo();
		v2.setAno(2000);
		v2.setPlaca("ABH587");
		v2.setValor(58203);
		
		Veiculo [] vetVeiculo = new Veiculo[2];
		vetVeiculo[0] = v1;
		vetVeiculo[1] = v2;
		
		ve1= new Vendedor();
		ve1.setComissao(213);
		ve1.setCpf("459602358-12");
		ve1.setNome("Leticia");
		ve1.setVeiculo(vetVeiculo);
		
	}

	public void mostraDados() {

		System.out.println("----- VENDEDOR -----");
		System.out.println("Nome: " + ve1.getNome());
		System.out.println("CPF: " + ve1.getCpf());
		System.out.println("Comissao por venda em reais: " + ve1.getComissao());
		for(int i=0;i<2;i++) {
        System.out.println("\nVeiculo vendido " + (i+1));
		System.out.println("Ano: " + ve1.getVeiculo()[i].getAno());
		System.out.println("Placa: " + ve1.getVeiculo()[i].getPlaca());
		System.out.println("Valor total em reais: " + ve1.getVeiculo()[i].getValor());}
	}

	public static void main (String args[]) {

		Principal m = new Principal();
		m.entraDados();
		m.mostraDados();

	}
}