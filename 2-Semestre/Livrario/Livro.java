package Livrario;

public class Livro extends Publicacao{
    private String ISBN;

    
    public Livro(String nome, String editora, String iSBN) {
        super(nome, editora);
        ISBN = iSBN;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }
    
    public String imprimir(){
        return "Nome: " + getNome() + "Editora: " + getEditora() + "ESPN: " + getISBN();
    }
}
