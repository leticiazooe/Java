public class Ganeleiro extends Caminhao {
	private double volume;
	private double comprimento;

	public double getVolume() {
		return volume;
	}

	public void setVolume(double volume) {
		this.volume = volume;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	@Override
	public double calculaPeso() {
		return this.getTara() + (this.getCombustivel() * 0.9) + (this.volume * 0.3 * this.comprimento * 0.2);
	}
}