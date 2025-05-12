import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Uri1015 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_4 = new DecimalFormat("0.0000");

        double x1 = teclado.nextDouble(); double y1 = teclado.nextDouble();
        double x2 = teclado.nextDouble(); double y2 = teclado.nextDouble();

        double d1 = Math.pow((x2 - x1), 2);
        double d2 = Math.pow((y2 - y1), 2);


        double distance = Math.sqrt((d1 + d2));
        System.out.println(df_4.format(distance));
        teclado.close();
    }
}