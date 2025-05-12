package exercicios2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class U3ex13 {
   public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    DecimalFormat df_2 = new DecimalFormat("0.00");

    System.out.println("Informe o comprimento da parede");
    double comp = teclado.nextDouble();
    System.out.println("Informe a altura da parede");
    double alt = teclado.nextDouble();

    double area = (comp * alt) * 112.50;

    System.out.println("O valor gasto com a compra de azulejos é R$ " + df_2.format(area));
    teclado.close();
   } 
}
