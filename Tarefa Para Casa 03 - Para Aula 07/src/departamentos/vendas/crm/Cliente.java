package departamentos.vendas.crm;
import departamentos.estoque.itens.*;

public class Cliente extends Produto{
	 private long id;
	 private String nome;
	 private String documento;
	 private char tipoDocumento;
	 private Produto produto;
	 
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public char getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(char tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
}
