import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1038 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        int a = teclado.nextInt(); int b = teclado.nextInt();
        double valor = 0;

        if (a == 1) {
           double total = valor + 4.00;
        }
        else if (a == 2) {
            double total = valor + 4.50;
        }
        else if (a == 3) {
            double total = valor + 5.00;
        }
        else if (a == 4) {
            double total = valor + 2.00;
        }
        else if (a == 5) {
            double total = valor + 1.50;
        }
        System.out.println("Total: R$ " + df_2.format(total));
    }
}
