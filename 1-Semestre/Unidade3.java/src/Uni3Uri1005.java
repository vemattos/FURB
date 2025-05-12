import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Uri1005 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_5 = new DecimalFormat("0.00000");

        double A = teclado.nextDouble();
        double B = teclado.nextDouble();

        double Ar = A * 3.5;
        double Br = B * 7.5;

        double resultado = (Ar + Br) / 11;
        
        System.out.println("MEDIA = " + df_5.format(resultado));
        teclado.close();
    }
}
