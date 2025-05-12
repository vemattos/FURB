package Relacionamento;

public class Site {
    private String nome;
    private String endereco;
    private Boolean status;
    public Site(String nome, String endereco, Boolean status) {
        this.nome = nome;
        this.endereco = endereco;
        this.status = status;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public Boolean getStatus() {
        return status;
    }
    public void setStatus(Boolean status) {
        this.status = status;
    }
    @Override
    public String toString() {
        return "Nome: " + nome + "\nEndereço: " + endereco + "\nStatus: " + status + "\n";
    }
    
}
