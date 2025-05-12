package zProva;

public class Motorista extends Passageiro{
    private int cnh;

    public Motorista(String nome, int cnh) {
        super(nome);
        this.cnh = cnh;
    }

    public int getCnh() {
        return cnh;
    }

    public void setCnh(int cnh) {
        this.cnh = cnh;
    }

    @Override
    public String toString() {
        return super.toString() + "\nCNH: " + getCnh();
    }
}
