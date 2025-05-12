package arraylists;

import java.util.ArrayList;

import Projetos.ponto;

public class AulaArraylist {
    public static void main(String[] args) {
        //array (vetor)
        String[] arrayEstatico = new String[5];
        arrayEstatico[0] = "Goku";
        arrayEstatico[1] = "Pedro";
        arrayEstatico[2] = "Maria";
        arrayEstatico[3] = "Ana";
        arrayEstatico[4] = "Vinicius";

        //arraylist
        ArrayList<String> arrayDinamico = new ArrayList<String>();
        arrayDinamico.add("Goku");
        arrayDinamico.add("Pedro");
        arrayDinamico.add("Maria");
        arrayDinamico.add("Ana");
        arrayDinamico.add("Vinicius");
       
        System.out.println("imprimindo o array estatico (vetor)");
        for (int i = 0; i < arrayEstatico.length; i++) {
            System.out.println(arrayEstatico[i]);
        }
        System.out.println("imprimindo o arraylist");
        for (int i = 0; i < arrayDinamico.size(); i++) {
            System.out.println(arrayDinamico.get(i));
        }

        //descobrindo o tamanho do arraylist
        System.out.println("Tamanho do arraylist " + arrayDinamico.size());

        //imprimindo a primeira posição do arraylist, get(posicao desejada)
        System.out.println("Primeira posição " + arrayDinamico.get(0));

        //imprimindo a última posição
        int ultimoIndice = arrayDinamico.size() - 1;
        System.out.println("Última posição " + arrayDinamico.get(ultimoIndice));

        //removendo um elemento por indice
        arrayDinamico.remove(2);
        System.out.println("imprimindo o arraylist 2");
        for (int i = 0; i < arrayDinamico.size(); i++) {
            System.out.println(arrayDinamico.get(i));
        }

        //limpando o arraylist
        arrayDinamico.clear();
        System.out.println("Tamanho " + arrayDinamico.size());

        //imprimindo o arraylist usando foreach
        for (String nome : arrayDinamico) {
            System.out.println(nome);
        }

        //criando um arraylist de tipos primitivos
        /*tipo primitivo ------ wrapper calss
        * int                   Integer
        * double                Double
        * float                 Float
        * char                  Character
        */
         ArrayList<Integer> numeros = new ArrayList<Integer>(); 
        numeros.add(50);

        //criando um arraylist de classe qualquer
        
        Pessoa ana = new Pessoa("Ana", 18);
        Pessoa vini = new Pessoa("Vini", 28);
        Pessoa marcos = new Pessoa("Marcos", 38);

        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
        pessoas.add(ana);
        pessoas.add(vini);
        pessoas.add(marcos);

        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa.getNome());
        }
    }
}
