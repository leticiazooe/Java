public class Empregado {
	private long ctps;
	private String nome;
	private double salario;
	private Departamento departamento;
	
	public long getCtps() {
		return ctps;
	}
	public void setCtps(long ctps) {
		this.ctps = ctps;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

}
