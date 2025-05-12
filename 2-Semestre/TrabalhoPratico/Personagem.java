//matheus gamba e vinicius mattos
package TrabalhoPratico;

import java.util.ArrayList;

class Personagem {

    private String nome;
    private String nomeReal;
    private ArrayList<SuperPoder> superpoderes;

    public Personagem(String nome, String nomeReal) {
        this.nome = nome;
        this.nomeReal = nomeReal;
        this.superpoderes = new ArrayList<>();
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNomeReal() {
        return nomeReal;
    }
    public void setNomeReal(String nomeReal) {
        this.nomeReal = nomeReal;
    }
    public ArrayList<SuperPoder> getSuperpoderes() {
        return superpoderes;
    }
    public void setSuperpoderes(ArrayList<SuperPoder> superpoderes) {
        this.superpoderes = superpoderes;
    }
    public void adicionarSuperPoder(SuperPoder superpoder) {
        superpoderes.add(superpoder);
    }
    public int calcularPoderTotal() {
        int poderTotal = 0;
        for (SuperPoder superpoder : superpoderes) {
            poderTotal += superpoder.getCategoria();
        }
        return poderTotal;
    }
}