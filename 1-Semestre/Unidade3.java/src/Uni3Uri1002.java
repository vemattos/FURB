import java.text.DecimalFormat;
import java.util.Scanner;

public class Uni3Uri1002 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
     DecimalFormat df_4 = new DecimalFormat("0.0000");

     double π = 3.14159;
     double R = teclado.nextDouble();

     double A = π * Math.pow(R, 2);

     System.out.println("A=" + df_4.format(A));
     teclado.close();


    }
}
