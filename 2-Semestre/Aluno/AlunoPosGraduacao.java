package Aluno;

public class AlunoPosGraduacao extends Aluno {

	private int pontosPoscomp;

	public AlunoPosGraduacao(String nome, String curso, int pontosPoscomp) {
		super(nome, curso);
		setPontosPoscomp(pontosPoscomp);
	}

	public void setPontosPoscomp(int pontosPoscomp) {
		this.pontosPoscomp = pontosPoscomp;
	}

	public int getPontosPoscomp() {
		return pontosPoscomp;
	}

	@Override
	public String exibirDados() {
		return "Nome: " + getNome() + "\nCurso: " + getCurso() + "\nPontos POSCOMP: " + getPontosPoscomp();
	} 

}
