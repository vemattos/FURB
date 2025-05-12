import java.util.Scanner;

public class Uni3Uri1004 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int A = teclado.nextInt();
        int B = teclado.nextInt();

        int PROD = A * B;
        System.out.println("PROD = " + PROD);
        teclado.close();

    }
}
