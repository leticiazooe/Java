
public class Orcamento extends Documento{
	private double pecas;
	private double maodeobra;

	
	public double getPecas() {
		return pecas;
	}

	public void setPecas(double pecas) {
		this.pecas = pecas;
	}
	public double getMaodeobra() {
		return maodeobra;
	}
	public void setMaodeobra(double maodeobra) {
		this.maodeobra = maodeobra;
	}
	
	@Override
	public double calculaTotal() {
		return this.getValor() + this.getJuros() + this.pecas + this.maodeobra;
		
	}
}