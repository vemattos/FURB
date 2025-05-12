package Ex2Lista;

public class Computador {
    private int numero;
    private int capacidade;
    private int memoria;
    public Computador(int numero, int capacidade, int memoria) {
        setNumero(numero);
        setCapacidade(capacidade);
        setMemoria(memoria);
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getCapacidade() {
        return capacidade;
    }
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    public int getMemoria() {
        return memoria;
    }
    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public String toString() {
        return "Dados:" + getNumero() + ", capacidade: " + getCapacidade() + ", memoria: " + getMemoria();
    }
 
}
