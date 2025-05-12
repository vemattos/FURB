import java.util.Scanner;
public class Uri1177 {
 
    static Scanner teclado;  
    static int[] N;
  
 public static void main(String[] args) {
        teclado = new Scanner(System.in);
        int aux = 0;
        int T = teclado.nextInt();
        N = new int[1000];
        for (int i = 0; i < 1000; i++){
            if (aux == T)
            aux = 0;
        N[i] = aux;
        aux++;    
        }
    
        processaDados();


    }

    public static void processaDados(){
     for (int i = 0; 1 < 1000; i++){
        System.out.println("N[" + i + "] = " + N[i]);
        teclado.close();
        }
    }//processa dados


    public static String retornaNome(){
        return  "";
    }
}