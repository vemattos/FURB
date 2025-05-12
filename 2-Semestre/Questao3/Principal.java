package Questao3;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Atleta> jogos = new ArrayList<Atleta>();

        //adicionando atletas
        jogos.add(new Lutador("Xamuel", 53.3, 19));
        jogos.add(new Jogador("GAMBO", 24.0, 14));

        //varrendo o arraylist de jogos
        for (Atleta umAtleta:jogos) {
            System.out.println("O alteta " + umAtleta.getNome() + "\nEstá na categoria: " + umAtleta.definirCategoria());//polimorfismo
        }
    }
}
