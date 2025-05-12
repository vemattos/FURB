package AulaHerança;

public class Professor extends Pessoa{
    
    private String area;
    private int horas;

    public Professor(String nome, int idade, String area, int horas) {
        super(nome, idade);
        this.area = area;
        this.horas = horas;
    }
    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area;
    }
    public int getHoras() {
        return horas;
    }
    public void setHoras(int horas) {
        this.horas = horas;
    }
    @Override
    public String toString() {
        return super.toString() + "\nÁrea: " + area + "\nHoras de trabalho: " + horas;
    }
    
}
