import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1014 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_3 = new DecimalFormat("0.000");

        int km = teclado.nextInt();
        double gas = teclado.nextDouble();
        double result = km / gas;

        System.out.println(df_3.format(result) + " km/l");
        teclado.close();
    }
}
