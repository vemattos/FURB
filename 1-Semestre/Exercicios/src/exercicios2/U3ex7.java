package exercicios2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class U3ex7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        System.out.print("Insira quantas latas de 350ml foram compradas: ");
        int lata1 = teclado.nextInt();
        System.out.print("Insira quantas latas de 600ml foram compradas: ");
        int lata2 = teclado.nextInt();
        System.out.print("Insira quantas latas de 2l foram compradas: ");
        int lata3 = teclado.nextInt();

        double total = ((lata1 * 0.35) + (lata2 * 0.65) + (lata3 * 2));
        System.out.println("O cliente comprou " + df_2.format(total) + " litros de refrigerante");
        teclado.close();
    }
}
