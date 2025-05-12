package Livrario;

public class Revista extends Publicacao{
    private String periodicidade;

    public Revista(String nome, String editora, String periodicidade) {
        super(nome, editora);
        this.periodicidade = periodicidade;
    }

    public String getperiodicidade() {
        return periodicidade;
    }

    public void setperiodicidade(String periodicidade) {
        this.periodicidade = periodicidade;
    }

    
}
