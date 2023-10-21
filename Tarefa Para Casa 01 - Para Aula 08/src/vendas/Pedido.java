package vendas;
import fabrica.Equipamento;

public class Pedido {
	private long numero;
	private String data;
	private double total;
	private Equipamento equipamento;
	private Cliente cliente;
	
	public long getNumero() {
		return numero;
	}
	public String getData() {
		return data;
	}
	public double getTotal() {
		return total;
	}
	public Equipamento getEquipamento() {
		return equipamento;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}	
}