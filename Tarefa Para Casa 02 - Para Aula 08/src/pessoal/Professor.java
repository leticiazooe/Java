package pessoal;
import inscricao.Participante;

public class Professor extends Participante {
	private String area;
	private String titulacao;
	
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
}
