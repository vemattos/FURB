package Projetos;
public class Concorrente {

    private String nome;
    private String area;
    private int inscricao;

    public Concorrente(String nome, String area, String inscricao) {
        
        setNome(nome);
        setArea(area);
        setInscricao(inscricao);
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

    
}
