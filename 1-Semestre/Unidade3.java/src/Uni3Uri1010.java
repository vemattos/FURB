import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Uri1010 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        int code1 = teclado.nextInt(); int qtd1 = teclado.nextInt(); double price1 = teclado.nextDouble();
        int code2 = teclado.nextInt(); int qtd2 = teclado.nextInt(); double price2  = teclado.nextDouble();

        double total = (qtd1 * price1) + (qtd2 * price2);

        System.out.println("VALOR A PAGAR: R$ " + df_2.format(total) + code1 + code2);
        teclado.close();

    }
}
