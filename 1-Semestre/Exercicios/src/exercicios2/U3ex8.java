package exercicios2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class U3ex8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        System.out.print("Insira o valor em dólares: ");
        double dolar = teclado.nextDouble();

        double real = dolar * 5.25;

        System.out.println("O valor devolvido será: " + df_2.format(real));
        teclado.close();

    }
}
