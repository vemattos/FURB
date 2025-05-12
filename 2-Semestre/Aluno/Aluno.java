package Aluno;

public abstract class Aluno {
	
	private String nome;
	private String curso;
	
	public Aluno(String nome, String curso) {
		setNome(nome);
		setCurso(curso);
	}
	
	public void setNome(String nome) throws IllegalArgumentException{
		if (nome.trim().equals("")) {
			throw new IllegalArgumentException();
		}
		this.nome = nome;
	}
	
	public void setCurso(String curso) throws IllegalArgumentException{
		if (curso.trim().equals("")) {
			throw new IllegalArgumentException();
		}
		this.curso = curso;
	}
	
	public String getCurso() {
		return curso;
	}
	
	public String getNome() {
		return nome;
	}
	
	public abstract String exibirDados();
	
//	public String exibirDados() {
//		return "Nome: " + getNome() + "\nCurso: " + getCurso();
//	}
}
