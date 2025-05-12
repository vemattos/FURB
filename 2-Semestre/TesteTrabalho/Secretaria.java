package ZZteste;

public class Secretaria extends Fisica{
    private String ct;

    public Secretaria(String nome, String cpf, String ct) {
        super(nome, cpf);
        this.ct = ct;
    }

    public String getCt() {
        return ct;
    }

    public void setCt(String ct) {
        this.ct = ct;
    }
    
}
