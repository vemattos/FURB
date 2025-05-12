package ListaExArray;

public class Computador {
    
    private int numeroSerial;
    private int capacidadeHD;
    private int quantidadeMemoria;
    
    public Computador(int numeroSerial, int capacidadeHD, int quantidadeMemoria) {
        this.numeroSerial = numeroSerial;
        this.capacidadeHD = capacidadeHD;
        this.quantidadeMemoria = quantidadeMemoria;
    }
    public int getNumeroSerial() {
        return numeroSerial;
    }
    public void setNumeroSerial(int numeroSerial) {
        this.numeroSerial = numeroSerial;
    }
    public int getCapacidadeHD() {
        return capacidadeHD;
    }
    public void setCapacidadeHD(int capacidadeHD) {
        this.capacidadeHD = capacidadeHD;
    }
    public int getQuantidadeMemoria() {
        return quantidadeMemoria;
    }
    public void setQuantidadeMemoria(int quantidadeMemoria) {
        this.quantidadeMemoria = quantidadeMemoria;
    }

    @Override
    public String toString() {
        return "Número de serie: " + numeroSerial + ", capacidade do HD: " + capacidadeHD + ", quantidade de memória:"
                + quantidadeMemoria;
    }
    
}
