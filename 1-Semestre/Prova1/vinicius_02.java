import java.text.DecimalFormat;
import java.util.Scanner;

public class vinicius_02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df_2 = new DecimalFormat("0.00");

        System.out.println("Opção A: 123Milhas, 15% de desconto");
        System.out.println("Opção B: MaxMilhas, 15% de desconto");
        System.out.println("Opção C: Azul Viagens, 20% de desconto");
        System.out.println("Opção D: Gol Viagens, 30% de desconto");
        System.out.println("Opção E: Latam Travel, 40% de desconto");
        System.out.println("Opção E: Outros, Não Há desconto");
        System.out.println("Insira a opção escolhida");
        char opcao = teclado.next().toUpperCase().charAt(0);
        System.out.println("Insira o preço de entrada");
        double pagar = teclado.nextDouble();

        if (opcao == 'A') {
            if (pagar <= 500) {
            double precoA1 = pagar * 0.15;
            double precoA2 = pagar - precoA1;
            System.out.println("Hotel: 1223Milhas");
            System.out.println("Desconto: " + df_2.format(precoA1));
            System.out.println("Preço total: " + df_2.format(precoA2));
            } 
            else {}
            System.out.println("Erro"); 
        }
        else if (opcao == 'B') {
            if (pagar <= 600) {   
            double precoB1 = pagar * 0.15;
            double precoB2 = pagar - precoB1;
            System.out.println("Hotel: MaxMilhas");
            System.out.println("Desconto: " + df_2.format(precoB1));
            System.out.println("Preço total: " + df_2.format(precoB2));
            }
            else {}
            System.out.println("Erro"); 
        }
        else if (opcao == 'C') {
            if (pagar <= 1500) {
            double precoC1 = pagar * 0.20;
            double precoC2 = pagar - precoC1;
            System.out.println("Hotel: Azul Viagens");
            System.out.println("Desconto: " + df_2.format(precoC1));
            System.out.println("Preço total: " + df_2.format(precoC2));
            }
            else {}
            System.out.println("Erro"); 
        }
        else if (opcao == 'D') {
            if (pagar >= 300 && pagar <=2000) {
            double precoD1 = pagar * 0.30;
            double precoD2 = pagar - precoD1;
            System.out.println("Hotel: Gol Viagens");
            System.out.println("Desconto: " + df_2.format(precoD1));
            System.out.println("Preço total: " + df_2.format(precoD2)); 
            }
            else {}
            System.out.println("Erro"); 
        }
        else if (opcao == 'E') {
            if (pagar >= 300 && pagar <=2000) {
            double precoE1 = pagar * 0.40;
            double precoE2 = pagar - precoE1;
            System.out.println("Hotel: Latam Travel");
            System.out.println("Desconto: " + df_2.format(precoE1));
            System.out.println("Preço total: " + df_2.format(precoE2)); 
            }
            else {}
            System.out.println("Erro"); 
        }   
        else if (opcao == 'F') {
            double precoF2 = pagar;
            System.out.println("Hotel fora da lista");
            System.out.println("Não há desconto");
            System.out.println("Preço total: " + df_2.format(precoF2));
        }
        else {
            System.out.println("Código inválido");

        }
        teclado.close();
    }
       
}


