package exercicios2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class U3ex6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        System.out.println("Insira o valor do prato em kg");
        double kg = teclado.nextDouble();
        
        double preco = (kg - 0.75) * 25;
        System.out.println("O preço final a pagar é R$ " + df_2.format(preco));
        teclado.close();

    }
} 
