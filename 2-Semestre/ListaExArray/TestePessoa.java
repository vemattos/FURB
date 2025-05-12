package ListaExArray;

import java.util.ArrayList;

public class TestePessoa {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

        inserir(pessoas, "Madara", "10");
        inserir(pessoas, "Obito", "11");

    }
    public static void inserir(ArrayList<Pessoa> lista, String nome, String cpf){
        Pessoa pessoa = new Pessoa(nome, cpf);
        lista.add(pessoa);
    }

    public static void imprimir(ArrayList<Pessoa> lista){
        for (Pessoa pessoa : lista) {
            System.out.println(pessoa);
        }
    }
}
