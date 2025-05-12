package zProva;

public class Passageiro {
    private String nome;

    public Passageiro(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Nome: " + getNome();
    }
    
}
