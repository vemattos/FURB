package Livrario;

public class Publicacao {

    private String nome;
    private String editora;
    
    public Publicacao(String nome, String editora) {
        this.nome = nome;
        this.editora = editora;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEditora() {
        return editora;
    }
    public void setEditora(String editora) {
        this.editora = editora;
    }
    
}
