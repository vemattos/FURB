package exercicios.src;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Bbcmat6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");
        System.out.println("Informe o código do funcionário");
        int codfun = teclado.nextInt();
        System.out.println("Informe a quantidade de horas trabalhadas");
        double hort = teclado.nextDouble();
        System.out.println("Informe o valor da hora");
        double valhora = teclado.nextDouble();
        double salario = hort * valhora;
        System.out.println("Funcionário" + codfun + "Salário:" + df_2.format(salario));
        teclado.close();
    }
}
