import java.util.Scanner;

public class Uni3Uri1021 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    
        // Entrada
        double N = teclado.nextDouble();  
        // Processo
        double nota100 = N / 100;
        double nota50 = (N % 100) / 50;
        double nota20 = (N % 100 % 50) / 20;
        double nota10 = (N % 100 % 50 % 20) / 10;
        double nota5 = (N % 100 % 50 % 20 % 10) / 5;
        double nota2 = (N % 100 % 50 % 20 % 10 % 5) / 2;
        double moeda1 = (N % 100 % 50 % 20 % 10 % 5 % 2) / 1;
        double moeda50 = (N % 100 % 50 % 20 % 10 % 5 % 2 % 1) / 0.50;
        double moeda25 = (N % 100 % 50 % 20 % 10 % 5 % 2 % 1 % 0.50) / 0.25;
        double moeda10 = (N % 100 % 50 % 20 % 10 % 5 % 2 % 1 % 0.50 % 0.25) / 0.10;
        double moeda5 = (N % 100 % 50 % 20 % 10 % 5 % 2 % 1 % 0.50 % 0.25 % 0.10) / 0.05;
        double moeda01 = (N % 100 % 50 % 20 % 10 % 5 % 2 % 1 % 0.50 % 0.25 % 0.10 % 0.05) / 0.01;
    
        // Saída
        System.out.println("NOTAS:");
        System.out.println((int)nota100 + " nota(s) de R$ 100.00");
        System.out.println((int)nota50 + " nota(s) de R$ 50.00");
        System.out.println((int)nota20 + " nota(s) de R$ 20.00");
        System.out.println((int)nota10 + " nota(s) de R$ 10.00");
        System.out.println((int)nota5 + " nota(s) de R$ 5.00");
        System.out.println((int)nota2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println((int)moeda1 + " moeda(s) de R$ 1.00");
        System.out.println((int)moeda50 + " moeda(s) de R$ 0.50");
        System.out.println((int)moeda25 + " moeda(s) de R$ 0.25");
        System.out.println((int)moeda10 + " moeda(s) de R$ 0.10");
        System.out.println((int)moeda5 + " moeda(s) de R$ 0.05");
        System.out.println((int)moeda01 + " moeda(s) de R$ 0.01");
        teclado.close();
      }
    }