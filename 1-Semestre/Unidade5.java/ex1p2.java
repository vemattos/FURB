import java.util.Scanner;

public class ex1p2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " é par");
            } else {
                System.out.println(i + " é impar");
            }
        }
        teclado.close();
    }
}