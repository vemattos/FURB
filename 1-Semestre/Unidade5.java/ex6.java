import java.text.DecimalFormat;
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        double somaaltura = 0;

        for (int i = 1; i <= 20; i++) {
            System.out.println("Digite a altura da pessoa " + i + ": ");
            double altura = teclado.nextDouble();
            somaaltura += altura;
        }
        double mediaaltura = somaaltura / 20;
        System.out.println("A média de altura das 20 pessoas é: " + df_2.format(mediaaltura));
        teclado.close();
    }
}
