import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df_1 = new DecimalFormat("0.0");

        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C  = sc.nextDouble();

        double calc = (A * 2) + (B * 3) + (C * 5);
        double MEDIA = calc / 10;

        System.out.println("MEDIA = " + df_1.format(MEDIA));
        sc.close();
    }
}
