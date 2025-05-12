package Relacionamento;

import java.util.ArrayList;

public class Familia {

    ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

    public static void main(String[] args) {
    Pessoa p = new Pessoa("VINIC", 10);
    Pessoa p2 = new Pessoa("WQE", 11);
    Familia f = new Familia();
      f.adicionarPessoa(p);
      f.adicionarPessoa(p2);
      System.out.println(f.toString());

    }
    public void adicionarPessoa(Pessoa pessoa){
        pessoas.add(pessoa);
    }

    public String toString() {
        String familia = "";
        for (int i = 0; i < pessoas.size(); i++) {
            familia += pessoas.get(i) + ", ";
        }
        return familia;
    }

}
