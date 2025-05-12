package Projetos;
public class Pessoa1 {
    
    private String nome;
    private int idade;
    public Pessoa1(String nome, int idade) {
        setNome(nome);
        setIdade(idade);
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        if (nome.trim().isEmpty()) {
            throw new IllegalArgumentException();
        }
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
            if (idade < 0) {
                throw new IllegalArgumentException();
            }
        this.idade = idade;
    }
    public String toString() {
        return "Nome " + this.getNome() + ", idade " + this.getIdade();
    } 
}
