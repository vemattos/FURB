package AulaHerança;

public class Aluno extends Pessoa{

    private int turma;
    private String horasDeAula;

    public Aluno(String nome, int idade, int turma, String horasDeAula) {
        super(nome, idade);
        this.turma = turma;
        this.horasDeAula = horasDeAula;
    }

    public int getTurma() {
        return turma;
    }

    public void setTurma(int turma) {
        this.turma = turma;
    }

    public String getHorasDeAula() {
        return horasDeAula;
    }

    public void setHorasDeAula(String horasDeAula) {
        this.horasDeAula = horasDeAula;
    }

    public void imprimirDados(){
        System.out.println(super.toString());
        System.out.println("Turma: " + this.turma);
        System.out.println("Horas de aula: " + this.horasDeAula);
    }
    
}
