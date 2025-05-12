package ZZteste;

public class Audiencia {
    private int data;
    private String recomendacao;
    public Audiencia(int data, String recomendacao) {
        this.data = data;
        this.recomendacao = recomendacao;
    }
    public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }
    public String getRecomendacao() {
        return recomendacao;
    }
    public void setRecomendacao(String recomendacao) {
        this.recomendacao = recomendacao;
    }
    
}
