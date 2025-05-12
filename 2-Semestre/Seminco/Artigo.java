package Seminco;

import java.util.ArrayList;

public class Artigo {
    
    private String titulo, autor;
    private ArrayList<Revisor> avaliadores; ///primeiro passo agregacao

    //definindo construtor
    public Artigo(String titulo, String autor){
        setTitulo(titulo);
        setAutor(autor);
        avaliadores = new ArrayList<Revisor>(); //segundo passo agregacao
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public ArrayList<Revisor> getAvaliadores() {
        return avaliadores;
    }

    public void setAvaliadores(ArrayList<Revisor> avaliadores) {
        this.avaliadores = avaliadores;
    }
  
    //metodo para adicionar avaliacao dos avaliadores
    public void adicionarAvaliacao(Revisor umRevisor){
        avaliadores.add(umRevisor);  //terceiro passo agregacao
    }

    public String imprimir(){
        String retorno = "Título " + getTitulo() + "\n" + "Autor: " + getAutor() + "\n";
        //varrendo e juntando com as avaliacoes dos revisores
        for(int i = 0; i < avaliadores.size(); i++){
            retorno = "Parecer no revisor #" + i + "\n"; 
            retorno = retorno + avaliadores.get(i).imprimir() + "\n\n";
        }
        return retorno;
    }
}
