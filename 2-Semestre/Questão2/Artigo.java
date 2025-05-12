package Questão2;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class Artigo {
    private String titulo;
    private String periodico;
    private Date dataPublicacao;
    private char qualis;

    public Artigo(String titulo, String periodico, Date dataPublicacao, char qualis) {
        this.titulo = titulo;
        this.periodico = periodico;
        this.dataPublicacao = dataPublicacao;
        this.qualis = qualis;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getPeriodico() {
        return periodico;
    }
    public void setPeriodico(String periodico) {
        this.periodico = periodico;
    }
    public Date getDataPublicacao() {
        return dataPublicacao;
    }
    public void setDataPublicacao(Date dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }
    public char getQualis() {
        return qualis;
    }
    public void setQualis(char qualis) {
        this.qualis = qualis;
    }
    
    public String exibirDados(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return "Título:" + getTitulo() + "\nPeriódico: " + getPeriodico() + "\nQualis: " + getQualis() + "\nData da publicação: " + getDataPublicacao();
    }
}
