import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Uri1009 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        String name = teclado.next();
        double fix = teclado.nextDouble();
        double sales = teclado.nextDouble();

        double totalsales = sales * 0.15;
        double salary = fix + totalsales;

        System.out.println("TOTAL = R$ " + df_2.format(salary) + name);
        teclado.close();
    
    }
}
