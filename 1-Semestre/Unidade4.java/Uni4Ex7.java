import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni4Ex7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        System.out.println("Entre com o peso da carta: ");
        int peso = teclado.nextInt();
        double valorpagar = 0.00;

        if (peso <= 50) {
            valorpagar = 0.45;
            System.out.println("Custo do selo = " + df_2.format(valorpagar));
        } else {
            int PesoExcedido = peso - 50;
            double qtAdicional = (PesoExcedido / 20) + 1;
            valorpagar = 0.45f + 0.45f * qtAdicional;
            System.out.println("Custo do selo = " + df_2.format(valorpagar));

            
        }
        teclado.close();
    }
}
