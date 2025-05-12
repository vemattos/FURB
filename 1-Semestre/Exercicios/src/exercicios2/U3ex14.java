package exercicios2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class U3ex14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        System.out.println("Informe a distância percorrida");
        double dist = teclado.nextDouble();
        System.out.println("Informe o tempo gasto com a viagem");
        double temp = teclado.nextDouble();

        double vm = dist / temp;
        double gfinal = dist / 12;

        System.out.println("O motorista gastou " + df_2.format(gfinal) + " litros de gasolina, viajando a uma velocidade de " + df_2.format(vm));
        teclado.close();

    }
}
