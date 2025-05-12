package zProva;

public class Municipal extends Onibus{
    private int lotacaoTotal;

    public Municipal(String placa, int qtPassageiros, double tarifa, int lotacaoTotal) {
        super(placa, qtPassageiros, tarifa);
        this.lotacaoTotal = lotacaoTotal;
    }

    public int getLotacaoTotal() {
        return lotacaoTotal;
    }

    public void setLotacaoTotal(int lotacaoTotal) {
        this.lotacaoTotal = lotacaoTotal;
    }

    @Override
    public String toString() {
        return super.toString() + "\nLotação total: " + getLotacaoTotal();
    }
}
