package exercicios2;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.lang.Math;

public class U3ex9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");
        
        System.out.println("Informe a altura da lata");
        double alt = teclado.nextDouble();
        System.out.println("Informe o raio da lata");
        double raio = teclado.nextDouble();


        double volume = (3.14 * alt * Math.pow(raio, 2));

        System.out.println("O volume da lata é " + df_2.format(volume));
        teclado.close();
    }

}





// volume= pi*+raio ao quadardo*altura