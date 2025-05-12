//matheus gamba e vinicius mattos
package TrabalhoPratico;

class Vilao extends Personagem {
    
    private int tempoPrisao;

    public Vilao(String nome, int tempoPrisao, String nomeReal) {
        super(nome, nomeReal);
        this.tempoPrisao = tempoPrisao;
    }
    public int getTempoPrisao() {
        return tempoPrisao;
    }
    public void setTempoPrisao(int tempoPrisao) {
        this.tempoPrisao = tempoPrisao;
    }
}
