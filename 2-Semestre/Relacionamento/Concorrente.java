package Relacionamento;

public class Concorrente {

    private String nome;
    private String area;
    private int inscricao;
    private int telefone;
    private String endereco;
    private String nota;

    public Concorrente(String nome, String area, int inscricao, int telefone, String endereco, String nota) {
        this.nome = nome;
        this.area = area;
        this.inscricao = inscricao;
        this.telefone = telefone;
        this.endereco = endereco;
        this.nota = nota;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area;
    }
    public int getInscricao() {
        return inscricao;
    }
    public void setInscricao(int inscricao) {
        this.inscricao = inscricao;
    }
    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getNota() {
        return nota;
    }
    public void setNota(String nota) {
        this.nota = nota;
    }
    @Override
    public String toString() {
        return "Concorrente: " + getNome() + "\nÁrea: " + getArea() + "\nInscrição: " + getInscricao() + "\nTelefone: " + getTelefone() + "\nEndereço: " + getEndereco() + "\nNota: " + getNota(); 
    }
    
    
}
