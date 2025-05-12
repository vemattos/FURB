package ZZteste;

public class Custo {
    private int data;
    private String descricao;
    private int valor;
    public Custo(int data, String descricao, int valor) {
        this.data = data;
        this.descricao = descricao;
        this.valor = valor;
    }
    public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
}
