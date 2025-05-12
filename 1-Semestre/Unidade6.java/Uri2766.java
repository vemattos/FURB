import java.util.Scanner;

public class Uri2766 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        //declaração do array unidimensional string
        String[] nomes = new String [10];

        //população do array criado (vetor)
        for (int i = 0; i < 10; i++) {
            nomes[i] = teclado.next();  
        }
        // terceiro nome da lista
        System.out.println(nomes[2]);
        //setimo nome da lista
         System.out.println(nomes[6]);
        //nono nome da lista
        System.out.println(nomes[8]);
        teclado.close();
    }
}
