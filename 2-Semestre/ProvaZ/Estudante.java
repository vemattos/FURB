package zProva;

public class Estudante extends Passageiro{
    private int ra;

    public Estudante(String nome, int ra) {
        super(nome);
        this.ra = ra;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    @Override
    public String toString() {
        return super.toString() + "\nRegistro Acadêmico: " + getRa();
    }
}
