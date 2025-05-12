package exercicios.src;

import java.util.Scanner;
import java.text.DecimalFormat;
public class Bccmat7 {
        public static void main(String[] args) {
            
        
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");
        System.out.println("Insira nome do vendedor");
        String nome = teclado.next();
        System.out.println("Insira salário fixo");
        double salario = teclado.nextDouble();
        System.out.println("Insira vendas no mês");
        double vendas = teclado.nextDouble();
        double lucro = salario + vendas * 0.15;
        System.out.println( nome + " receberá R$" + df_2.format(lucro) + " no final do mês");
        teclado.close();
        }
    }  

