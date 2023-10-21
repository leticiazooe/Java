public class Tanque extends Caminhao {
	private double litros;

	public double getLitros() {
		return litros;
	}

	public void setLitros(double litros) {
		this.litros = litros;
	}

	@Override
	public double calculaPeso() {
		return this.getTara() + (this.getCombustivel() * 0.9) + (this.litros * 0.6);
	}
	
}