package Aluno;
import java.util.Scanner;

public class Principal {

	public Principal() {
		Scanner s = new Scanner(System.in);

		System.out.print("Nome: ");
		String nome = s.next();
		System.out.print("Curso: ");
		String curso = s.next();
		System.out.print("G - Graduação / P - Pós-gradução: ");
		char tipoAluno = s.next().toUpperCase().charAt(0);

		Aluno aluno = null; //new Aluno(nome, curso);
		
		switch (tipoAluno) {
		case 'G':
			System.out.print("Semestre: ");
			int semestre = s.nextInt();
			aluno = new AlunoGraduacao(nome, curso, semestre);
			break;
		case 'P':
			System.out.println("Pontos do POSCOMP: ");
			int pontosPoscomp = s.nextInt();
			aluno = new AlunoPosGraduacao(nome, curso, pontosPoscomp);
			break;
		default:
			System.out.println("Tipo de aluno inv�lido.");
		}
		
//		if (aluno instanceof AlunoGraduacao) {
//			System.out.println(((AlunoGraduacao) aluno).exibirDados());
//		} else if (aluno instanceof AlunoPosGraduacao) {
//			System.out.println(((AlunoPosGraduacao)aluno).exibirDados());
//		}

		System.out.println(aluno.exibirDados());
		
		s.close();
	}

	public static void main(String[] args) {
		new Principal();
	}

}
