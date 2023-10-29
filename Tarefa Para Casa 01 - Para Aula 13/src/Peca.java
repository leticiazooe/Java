
public class Peca {
	private String id;
	private String nome;
	private String especificacao;
	private Componente componente[];
	private Projeto projeto;
	
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
	public String getEspecificacao() {
		return especificacao;
	}
	public void setEspecificacao(String especificacao) {
		this.especificacao = especificacao;
	}
	public Componente[] getComponente() {
		return componente;
	}
	public void setComponente(Componente[] componente) {
		this.componente = componente;
	}
	public Projeto getProjeto() {
		return projeto;
	}
	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}
}
