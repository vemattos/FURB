package Projetos;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    private ArrayList<Pessoa1> listaNomes;
    public Principal(){
        listaNomes = new ArrayList<>();
        popular();
        imprimir();
    }

    private void popular(){
    Scanner s = new Scanner (System.in);
    System.out.println(s);
    System.out.println("Digite um nome ou \"fim\" para sair");
    String nome = s.next();
        
    while (!nome.equalsIgnoreCase("fim")){    
        System.out.println("Digite a idade");
        int idade = s.nextInt();

        Pessoa1 p = new Pessoa1(nome, idade);
        
        //add no arryalist
        listaNomes.add(p);
        System.out.println("Digite um nome ou \"fim\" para sair");
        nome = s.next();
        }
    }
    private void imprimir(){
        //for (int i =0; i< listaNomes.size(); i++){
       //     System.out.println(listaNomes.get(i).toString());
       // }
       for(Pessoa1 p: listaNomes){
        System.out.println(p.toString());
       }
    }

    public static void main(String[] args) {
        new Principal();
    }
}







