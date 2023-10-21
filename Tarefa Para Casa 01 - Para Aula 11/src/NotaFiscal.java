
public class NotaFiscal extends Documento{
	private double desconto;
	private double acrescimo;
	
	public double getDesconto() {
		return desconto;
	}
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	public double getAcrescimo() {
		return acrescimo;
	}
	public void setAcrescimo(double acrescimo) {
		this.acrescimo = acrescimo;
	}
	
	@Override
	public double calculaTotal() {
		return this.getValor() + this.getJuros() - this.desconto + this.acrescimo;
 }
}
