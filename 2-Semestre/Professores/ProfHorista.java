package Professores;

public class ProfHorista extends Professor{
    
    private int horas;
    private double salario;

    public ProfHorista(String nome, String matricula, int idade, int horas, double salario) {
        super(nome, matricula, idade);
        this.horas = horas;
        this.salario = salario;

    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    } 
    
}
