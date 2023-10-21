public class Equipamento {
	private long id;
	private String nome;
	private String marca;
	private Uso uso;
	private Equipamento equipamento;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id=id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome=nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca=marca;
	}
	public Uso getUso() {
		return uso;
	}
	public void setUso(Uso uso) {
		this.uso=uso;
	}
	public Equipamento getEquipamento() {
		return equipamento;
	}
	public void setequipamento(Equipamento equipamento) {
		this.equipamento=equipamento;
	}
}