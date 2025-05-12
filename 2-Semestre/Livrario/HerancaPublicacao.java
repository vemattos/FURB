package Livrario;

public class HerancaPublicacao {
    public static void main(String[] args) {
        Livro umLivro = new Livro(null, null, null);
        umLivro.setNome("Java");
        umLivro.setEditora("Java");
        umLivro.setISBN("ESPN");
        
        Revista umaRevista = new Revista(null, null, null);
        umaRevista.setNome("Recreio");
        umaRevista.setEditora("Java");
        umaRevista.setperiodicidade("Per");
    }   
}
