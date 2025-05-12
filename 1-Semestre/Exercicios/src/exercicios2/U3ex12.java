package exercicios2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class U3ex12 {
    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      DecimalFormat df_2 = new DecimalFormat("0.00");

      System.out.print("Informe o nome do funcionário: ");
      String nome = teclado.next();

      System.out.print("Informe o número de horas trabalhadas: ");
      int horas = teclado.nextInt();

      System.out.print("Insira o número de dependentes: ");
      int dependentes = teclado.nextInt();

      double bruto = horas * 10 + dependentes * 60;
      double liquido = horas * 10 * 0.865 + dependentes * 60;
    

      System.out.print(nome + " receberá um salário bruto de R$ " + df_2.format(bruto) + " e um salário liquido de R$" + df_2.format(liquido));
      teclado.close();

    }
}
