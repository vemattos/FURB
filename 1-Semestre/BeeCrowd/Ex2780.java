import java.util.Scanner;

public class Ex2780 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int D = teclado.nextInt();

        if (D <= 800) {
            System.out.println("1");
        }
        else if (D > 800 && D <= 1400) {
            System.out.println("2");
        }
        else if (D > 1400 && D <= 2000) {
            System.out.println("3");
        }
        teclado.close();

    }
}
