package zProva;

public class Aposentado extends Passageiro{
    private int rg;

    public Aposentado(String nome, int rg) {
        super(nome);
        this.rg = rg;
    }

    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
        this.rg = rg;
    }

    @Override
    public String toString() {
        return super.toString() + "\nRG: " + getRg();
    }
    
}
