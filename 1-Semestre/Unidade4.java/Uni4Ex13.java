import java.util.Scanner;

public class Uni4Ex13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Leia carta 1");
        int carta1 = teclado.nextInt();
        System.out.println("Leia carta 2");
        int carta2 = teclado.nextInt();
        System.out.println("Leia carta 3");
        int carta3 = teclado.nextInt();

        int QtBoas = 0;

        if (carta1 == 1 || carta1 == 2 || carta1 == 3) {
           QtBoas = 1;    
        }
        if (carta2 == 1 || carta2 == 2 || carta2 == 3) {
            QtBoas = QtBoas + 1;            
        }
        if (carta3 == 1 || carta3 == 2 || carta3 == 3) {
            QtBoas = QtBoas + 1;
        }
        if (QtBoas == 1) {
            System.out.println("TRUCO");           
        }
        if (QtBoas == 2) {
            System.out.println("SEIS");
        }
        if (QtBoas == 3) {
            System.out.println("NOVE");
        }
        else{
            System.out.println(" ");
 
    }
teclado.close();
}
}