
public class Equipamento {
	private String id;
	private String nome;
	private String modelo;
	private Laboratorio laboratorio;
	private Peca peca[];

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Peca[] getPeca() {
		return peca;
	}

	public void setPeca(Peca[] peca) {
		this.peca = peca;
	}

	public Laboratorio getLaboratorio() {
		return laboratorio;
	}

	public void setLaboratorio(Laboratorio laboratorio) {
		this.laboratorio = laboratorio;
	}

}
