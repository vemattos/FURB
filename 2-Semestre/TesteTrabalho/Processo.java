package ZZteste;

import java.util.ArrayList;

public class Processo {
    private int codigo;
    private String descricao;
    private Tribunal tribunal;
    private Vara vara;
    private ArrayList<Audiencia> audiencias;
    private Pessoa cliente;
    private Pessoa contrario;
    private Advogado advogado;
    private Secretaria secretaria;
    private ArrayList<Custo> custo;
    public Processo(int codigo, String descricao, Tribunal tribunal, Vara vara,Pessoa cliente, Pessoa contrario, Advogado advogado, Secretaria secretaria) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.tribunal = tribunal;
        this.vara = vara;
        
        this.cliente = cliente;
        this.contrario = contrario;
        this.advogado = advogado;
        this.secretaria = secretaria;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Tribunal getTribunal() {
        return tribunal;
    }
    public void setTribunal(Tribunal tribunal) {
        this.tribunal = tribunal;
    }
    public Vara getVara() {
        return vara;
    }
    public void setVara(Vara vara) {
        this.vara = vara;
    }
    public ArrayList<Audiencia> getAudiencias() {
        return audiencias;
    }
    public void setAudiencias(ArrayList<Audiencia> audiencias) {
        this.audiencias = audiencias;
    }
    public Pessoa getCliente() {
        return cliente;
    }
    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }
    public Pessoa getContrario() {
        return contrario;
    }
    public void setContrario(Pessoa contrario) {
        this.contrario = contrario;
    }
    public Advogado getAdvogado() {
        return advogado;
    }
    public void setAdvogado(Advogado advogado) {
        this.advogado = advogado;
    }
    public Secretaria getSecretaria() {
        return secretaria;
    }
    public void setSecretaria(Secretaria secretaria) {
        this.secretaria = secretaria;
    }
    public ArrayList<Custo> getCusto() {
        return custo;
    }
    public void setCusto(ArrayList<Custo> custo) {
        this.custo = custo;
    }
    
}
