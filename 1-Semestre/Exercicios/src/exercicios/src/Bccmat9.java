package exercicios.src;


import java.util.Scanner;
import java.text.DecimalFormat;

public class Bccmat9 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    DecimalFormat df_2 = new DecimalFormat("0.00");
    System.out.println("Insira o valor em dólares");
    double dolar = teclado.nextDouble();
   
    double real = dolar * 5.19;

    System.out.println("O valor em reais é " + df_2.format(real));
    teclado.close();
    }
    
}
