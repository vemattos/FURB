package exercicios2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class U3ex5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        System.out.println("Informe número de galos");
        int ngalos = teclado.nextInt();

        double vp1 = 4.00;
        double vp2 = 7.00;


        double pfinal = (vp1 + vp2) * ngalos;
        System.out.print("O preço para marcar todos os galos é: " + df_2.format(pfinal));
        teclado.close();

    }
}
