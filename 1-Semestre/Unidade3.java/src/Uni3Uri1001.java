import java.util.Scanner;

public class Uni3Uri1001 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int A = teclado.nextInt();
        int B = teclado.nextInt();

        int total = A + B;

        System.out.println("X = " + total);
        teclado.close();
    }
    
}