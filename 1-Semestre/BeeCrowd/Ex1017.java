import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex1017 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_3 = new DecimalFormat("0.000");

        int horas = teclado.nextInt();
        int velocidade = teclado.nextInt();
        int gasto = 12;

        double distancia = velocidade * horas;
        double litros = distancia / gasto;

        System.out.println(df_3.format(litros));
        teclado.close();

    }
}
