package Relacionamento;

import java.util.ArrayList;

public class Prova {
    ArrayList<Concorrente> concorrentes = new ArrayList<Concorrente>();
    public static void main(String[] args) {

        Concorrente c1 = new Concorrente("A", "CASA", 1, 10, "VICTOR KONDER", "10");
        Concorrente c2 = new Concorrente("B", "APARTAMENTO", 2, 11, "VICTOR KONDER", "10");
        Concorrente c3 = new Concorrente("C", "SALA", 3, 12, "VICTOR KONDER", "11");

        Prova p = new Prova();

        p.adicionaConcorrentes(c1);
        p.adicionaConcorrentes(c2);
        p.adicionaConcorrentes(c3);

        System.out.println(p.leConcorrentes());
    }
    public void adicionaConcorrentes(Concorrente concorrente){
        concorrentes.add(concorrente);
    }
    public String leConcorrentes(){
        String nomes = "";
        for (int i = 0; i < concorrentes.size(); i++) {
            nomes += concorrentes.get(i) + ", ";
        }
        return nomes;
    }

   
}
