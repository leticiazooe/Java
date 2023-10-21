package logistica.carga;
import logistica.Terrestre;

public class Caminhao extends Terrestre {
	private long peso;

	public long getPeso() {
		return peso;
	}

	public void setPeso(long peso) {
		this.peso = peso;
	}
}
