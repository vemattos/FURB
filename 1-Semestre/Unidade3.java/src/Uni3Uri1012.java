import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Uri1012 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_3 = new DecimalFormat("0.000");
 
        double A = teclado.nextDouble(); double B = teclado.nextDouble(); double C = teclado.nextDouble();

        double tri = (A*C) / 2;
        double cir = 3.14159 * Math.pow(C, 2);
        double trap = (A+B)*C / 2;
        double quad = B * B;
        double ret = A * B;

        System.out.println("TRIANGULO: " + df_3.format(tri));
        System.out.println("CIRCULO: " + df_3.format(cir));
        System.out.println("TRAPEZIO: " + df_3.format(trap));
        System.out.println("QUADRADO: " + df_3.format(quad) );
        System.out.println("RETANGULO: " + df_3.format(ret));
        teclado.close();
        
        }
}
