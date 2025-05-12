package Seminco;

public class Revisor {
    
    private String nome, conteudo, parecer;

    public Revisor(String nome, String conteudo, String parecer) {
        setNome(nome);
        setConteudo(conteudo);
        setParecer(parecer);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getParecer() {
        return parecer;
    }

    public void setParecer(String parecer) {
        this.parecer = parecer;
    }

    //metodo para visualizar as informacoes do objeto
    public String imprimir(){
        return "Conteudo: " + getConteudo() + "\n " + "Parecer: " + getParecer();
    }
}
