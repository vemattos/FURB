package exercicios2;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.lang.Math;

public class U3ex10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        System.out.println("Insira o valor do cateto 1");
        double cat1 = teclado.nextDouble();
        System.out.println("Insira o valor do cateto 2");
        double cat2 = teclado.nextDouble();

        double hip =  Math.pow(cat1, 2) + Math.pow(cat2, 2); 


        System.out.println("O comprimento da hipotenusa é " + df_2.format(Math.sqrt(hip)));
        teclado.close();

    }
}
