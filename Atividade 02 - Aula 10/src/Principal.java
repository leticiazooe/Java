//aula do dia 09/10 - faltei. 
public class Principal {
    private PosGraduacao posGrad;
    private Graduacao graduacao;
    private Aluno aluno;

    public void entraDados() {
        posGrad = new PosGraduacao();
        posGrad.setRa(13579);
        posGrad.setNome("Claudia");
        posGrad.setProva(100);
        posGrad.setTrabalho(75);
        posGrad.setArtigo(80);
        posGrad.setBanca(90);

        graduacao = new Graduacao();
        graduacao.setRa(246810);
        graduacao.setNome("Juliano");
        graduacao.setProva(100);
        graduacao.setTrabalho(75);
        graduacao.setTcc(95);
        graduacao.setEstagio(100);

        aluno = new Aluno();
        aluno.setRa(987321);
        aluno.setNome("Cristhiane");
        aluno.setProva(95);
        aluno.setTrabalho(60);
    }

    public void mostraDados() {
        System.out.println("--- POS GRADUACAO ---");
        System.out.println("Nome: " + posGrad.getNome());
        System.out.println("RA: " + posGrad.getRa());
        System.out.println("Prova: " + posGrad.getProva());
        System.out.println("Trabalho: " + posGrad.getTrabalho());
        System.out.println("Artigo: " + posGrad.getArtigo());
        System.out.println("Banca: " + posGrad.getBanca());

        System.out.println();

        System.out.println("--- GRADUACAO ---");
        System.out.println("Nome : " + graduacao.getNome());
        System.out.println("RA: " + graduacao.getRa());
        System.out.println("Prova: " + graduacao.getProva());
        System.out.println("Trabalho: " + graduacao.getTrabalho());
        System.out.println("TCC: " + graduacao.getTcc());
        System.out.println("Estagio : " + graduacao.getEstagio());

        System.out.println();

        System.out.println("--- ALUNO ---");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("RA : " + aluno.getRa());
        System.out.println("Prova: " + aluno.getProva());
        System.out.println("Trabalho: " + aluno.getTrabalho());
    }

    public static void main(String args[]) {
        Principal p = new Principal();
        p.entraDados();
        p.mostraDados();
    }
}
