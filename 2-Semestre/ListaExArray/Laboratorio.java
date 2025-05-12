package ListaExArray;

import java.util.ArrayList;

public class Laboratorio {

    private ArrayList<Computador> computadores;

    public Laboratorio(){
        computadores = new ArrayList<>();
        adicionaComputador(computadores, new Computador(1, 10, 50));
        adicionaComputador(computadores, new Computador(2, 20, 60));
        adicionaComputador(computadores, new Computador(3, 30, 70));
        adicionaComputador(computadores, new Computador(4, 40, 80));
        imprimir(computadores);
    }
    public void adicionaComputador(ArrayList<Computador> lista, Computador computadores){
        lista.add(computadores);
    }

    public void imprimir(ArrayList<Computador> lista){
        for (Computador computador : lista) {
            System.out.println(computador.toString());
        }
    }


    public static void main(String[] args) {
        new Laboratorio();
    }
}
