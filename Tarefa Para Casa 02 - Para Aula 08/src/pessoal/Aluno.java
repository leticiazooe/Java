package pessoal;
import inscricao.Participante;

public class Aluno extends Participante {
	private String passaporte;
	private String atribuicao;
	
	public String getPassaporte() {
		return passaporte;
	}
	public void setPassaporte(String passaporte) {
		this.passaporte = passaporte;
	}
	public String getAtribuicao() {
		return atribuicao;
	}
	public void setAtribuicao(String atribuicao) {
		this.atribuicao = atribuicao;
	}
}
