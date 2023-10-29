
public class Vendedor {
	private String cpf;
	private String nome;
	private double comissao;
	private Veiculo veiculo[];
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	public Veiculo[] getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Veiculo[] veiculo) {
		this.veiculo = veiculo;
	}
	
}
