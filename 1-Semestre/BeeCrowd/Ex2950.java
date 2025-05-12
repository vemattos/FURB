import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex2950 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        int d = teclado.nextInt(); int p1 = teclado.nextInt(); int p2 = teclado.nextInt();
        double soma = p1 + p2;
        double icm = d / soma;
            System.out.println(df_2.format(icm));
 
        teclado.close();
    }
}
