package ListaExArray;

import java.util.ArrayList;

public class TestePessoaerro {
   
    public static void main(String[] args) {

        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        
        adicionarPessoa(pessoas, "Madara", "10");
        adicionarPessoa(pessoas, "Obito", "11");    
   
        imprimirPessoas(pessoas);
    }
    public static void adicionarPessoa(ArrayList<Pessoa> lista, String nome, String cpf) {
    Pessoa pessoa = new Pessoa(nome, cpf);
    lista.add(pessoa);
    }
    public static void imprimirPessoas(ArrayList<Pessoa> lista) {
        for (Pessoa pessoa : lista) {
            System.out.println("Nome: " + pessoa.getNome() + ", Cpf: " + pessoa.getCpf());
        }
    }
}
