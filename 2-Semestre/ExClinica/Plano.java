package ClinicaPedrita;

public class Plano {

    //definindo atributos da classe

    private String nome;
    private int ano;
    private int qtDependentes;

    //definindo construtor

    public Plano(String nome, int ano, int qtDependentes) {
        this.nome = nome;
        this.ano = ano;
        this.qtDependentes = qtDependentes;
    }

    //metodos modificadores e acessores
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public int getQtDependentes() {
        return qtDependentes;
    }
    public void setQtDependentes(int qtDependentes) {
        this.qtDependentes = qtDependentes;
    }

    public String toString() {
        return "Nome do plano: " + getNome() + "\nAno de início: " + getAno() + "\nQuantidade de dependentes: " + getQtDependentes();
    }
}
