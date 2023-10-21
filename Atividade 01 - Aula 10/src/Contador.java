
public class Contador extends Funcionario {
	private double adicional;

	public double getAdicional() {
		return adicional;
	}

	public void setAdicional(double adicional) {
		this.adicional = adicional;
	}

	@Override
	public double calculaRecebimento() {
		return this.getSalario() - this.getIr() + this.adicional;
	}

}
