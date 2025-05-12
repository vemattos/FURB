package ZZteste;

import java.util.ArrayList;

public class Tribunal {
    private String nome;
    private ArrayList<Vara> varas = new ArrayList<Vara>();

    public Tribunal(String nome, ArrayList<Vara> varas) {
        this.nome = nome;
        this.varas = varas;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public ArrayList<Vara> getVaras() {
        return varas;
    }
    public void setVaras(ArrayList<Vara> varas) {
        this.varas = varas;
    }

}
