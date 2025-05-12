package Aluno;

public class AlunoGraduacao extends Aluno {

	private int semestre;

	public AlunoGraduacao(String nome, String curso, int semestre) {
		super(nome, curso);
		setSemestre(semestre);
	}

	public void setSemestre(int semestre) throws IllegalArgumentException {
		if (semestre <= 0) {
			throw new IllegalArgumentException();
		}
		this.semestre = semestre;
	}

	public int getSemestre() {
		return semestre;
	}

	@Override
	public String exibirDados() {

		return "Nome: " + this.getNome() + "\nCurso: " + this.getCurso() + "\nSemestre: " + this.getSemestre();

	}

}
