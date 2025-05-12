package ListaExArray;

import java.util.ArrayList;

public class Exercicio {

    public static void main(String[] args) {

        ArrayList<String> times = new ArrayList<String>();

        times.add("INTER");
        times.add("Botafogo");
        times.add("Coritiba");
        times.add("Vasco");
        times.add("Flamengo");
        times.add("Real Madrid");
        times.add("flu");
        times.add("Braga");
        times.add("Leverkussen");
        times.add("Liverpool");

        System.out.println(times.size());
        for (int i = 0; i < times.size(); i++) {
            System.out.println(times.get(i));
        }

        times.remove(6);
         System.out.println(times.size());
        for (int i = 0; i < times.size(); i++) {
            System.out.println(times.get(i));
        }
    }
}
