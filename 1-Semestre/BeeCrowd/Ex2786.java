import java.util.Scanner;

public class Ex2786 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int L = teclado.nextInt();
        int C = teclado.nextInt();

        int c1 = L * C + (L-1) * (C-1);
        int c2 = (L-1) * 2 + (C-1) * 2;

        System.out.println(c1);
        System.out.println(c2);
        
        teclado.close();

    }
}
