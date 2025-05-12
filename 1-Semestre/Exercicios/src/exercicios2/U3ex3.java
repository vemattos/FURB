package exercicios2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class U3ex3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        System.out.println("Informe preço do litro");
        double plitro = teclado.nextDouble();

        System.out.println("Informe o valor pago");
        double vpago = teclado.nextDouble();
        
        double qtd = vpago / plitro;

        System.out.println("O tanque foi preenchido com " + df_2.format(qtd) + " litros ");
        teclado.close();

    }
}
