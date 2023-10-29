
public class Funcionario {
	private String data;
	private String cidade;
	private double valor;
	private Departamento departamento;
	private Relatorio relatorio[];
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	public Relatorio[] getRelatorio() {
		return relatorio;
	}
	public void setRelatorio(Relatorio[] relatorio) {
		this.relatorio = relatorio;
	}
	
	
}
