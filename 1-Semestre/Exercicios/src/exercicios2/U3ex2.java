package exercicios2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class U3ex2 {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    DecimalFormat df_2 = new DecimalFormat("0.00");
    
    System.out.println("Informe o valor do calçado");
    double vlrc = teclado.nextDouble();
     double desconto = vlrc * 0.12;
     System.out.println("O valor do desconto será R$ " + df_2.format(desconto));

     double vlrpf = vlrc - desconto;
     System.out.println("O preço do par de sapatos com desconto é R$ " + df_2.format(vlrpf));
     teclado.close();

  }  
}
