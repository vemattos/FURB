import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Uri1008 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        System.out.println("Insira o código do empregado.");
        int employee = teclado.nextInt();
        System.out.println("Insira o número de horas de trabalho");
        int hours = teclado.nextInt();
        System.out.println("Insira o salário por hora");
        double perhour = teclado.nextDouble();

        double payment = hours * perhour;

        System.out.println("NUMBER = " + employee);
        System.out.println("SALARY = U$ " + df_2.format(payment));
        teclado.close();

    }
}
