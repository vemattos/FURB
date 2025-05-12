import java.util.Scanner;

public class Uni4Ex19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("X= ");
        int x = teclado.nextInt();
        System.out.print("Y= ");
        int y = teclado.nextInt();

        if (x == 0 && y == 0) {
            System.out.println("0");
        }
        else if (x > 0 && y > 0) {
            System.out.println("1");
        }
        else if (x > 0 && y < 0) {
            System.out.println("2");
        }
        else if (x < 0 && y < 0) {
            System.out.println("3");
        }
        else if (x < 0 && y > 0) {
            System.out.println("4");
        }
        teclado.close();
    }
}
