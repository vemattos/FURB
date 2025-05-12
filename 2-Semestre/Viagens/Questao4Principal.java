package Viagens;

import java.util.HashMap;

public class Questao4Principal {
    
    public static void main(String[] args) {
        //criando hashmap para armazenar varios navios
        HashMap<Integer,Navio> frota = new HashMap<Integer,Navio>();

        //criando um objeto do tipo navio
        Navio umNavio = new Navio(768, 1498, "Barco barco");
        //criando objeto do tipo bote e adicionando ao arraylist botes
        umNavio.adicionarBotes(new Botes(5452, 498, false));
        umNavio.adicionarBotes(new Botes(2346, 328, true));
        umNavio.adicionarBotes(new Botes(438, 157, true));
        //exibindo informações do navio e se é seguro ou não
        System.out.println(umNavio.mostrar());
        //adicionando navios a frota, put (key/value)
        frota.put(umNavio.getRegistroCapitania(), umNavio);

        Navio outroNavio = new Navio(123, 567, "Gambá");
        outroNavio.adicionarBotes(new Botes(678, 34, true));
        outroNavio.adicionarBotes(new Botes(543, 853, true));
        outroNavio.adicionarBotes(new Botes(231, 400, false));
        
        //adicionando navio a frota
        frota.put(outroNavio.getRegistroCapitania(), outroNavio);
        try{
        System.out.println(frota.get(123).mostrar());
        } catch(Exception e){
            System.out.println("Navio inexistente");
        }
    }
}
