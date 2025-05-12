package zProva;

public class Intermunicipal extends Onibus{
    private double taxaEmbarque = 0.70;

    public Intermunicipal(String placa, int qtPassageiros, double tarifa, double taxaEmbarque) {
        super(placa, qtPassageiros, tarifa);
        this.taxaEmbarque = taxaEmbarque;
    }

    public double getTaxaEmbarque() {
        return taxaEmbarque;
    }

    public void setTaxaEmbarque(double taxaEmbarque) {
        this.taxaEmbarque = taxaEmbarque;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTaxa de embarque: " + getTaxaEmbarque();
    }
}
