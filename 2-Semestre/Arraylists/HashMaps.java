package arraylists;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {
        
        HashMap<Integer, String> carros = new HashMap<Integer,String>();

        carros.put(0, "porsche");
        carros.put(1, "ferrari");
        carros.put(2, "lamborghini");
        carros.put(3, "mclaren");
        carros.put(4, "mercedes");

        System.out.println(carros); //imprime o hashmap

        System.out.println(carros.size()); //imprime tamanho do hashmap
        
        System.out.println(carros.values());//imprime apenas valores

        //fori
        for (int i = 0; i < carros.size(); i++) {
            System.out.println(carros.get(i));
        }

        //foreach
        for (String c : carros.values()) {
            System.out.println(c);
        }

        carros.remove(3); //remove valor do hasmap
        System.out.println(carros.values()); 

        carros.clear(); //limpa o hashmap
        System.out.println(carros.values());

        System.out.println();
         System.out.println();
          System.out.println();
           System.out.println();
            System.out.println();
             System.out.println();

        //revisao arraylist
        ArrayList<String> anime = new ArrayList<String>();
        anime.add("Naruto");
        anime.add("Sasuke");
        anime.add("Obito");
        anime.add("Madara");
        anime.add("Itachi");

        System.out.println(anime);

        for (int i = 0; i < anime.size(); i++) {
            System.out.println(anime.get(i));
        }
        System.out.println();
        for (String c : anime) {
            System.out.println(c);
        }
        anime.remove(0);
        System.out.println(anime);

    }
}
