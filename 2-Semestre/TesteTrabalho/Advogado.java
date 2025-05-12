package ZZteste;
public class Advogado extends Fisica{
    private String oab;

    public Advogado(String nome, String cpf, String oab) {
        super(nome, cpf);
        this.oab = oab;
    }

    public String getOab() {
        return oab;
    }

    public void setOab(String oab) {
        this.oab = oab;
    }
    
}
