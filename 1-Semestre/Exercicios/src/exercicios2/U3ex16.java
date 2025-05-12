package exercicios2;

import java.util.Scanner;

public class U3ex16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        

    System.out.println("Insira o valor da compra");
    int valortotal = teclado.nextInt();
    System.out.println("Insira o valor pago pelo cliente");
    int valorpago = teclado.nextInt();

    int troco = valortotal - valorpago;
    int notas100 = troco / 100;
    int notas10 = (troco % 100) /10;
    int notas1 = (troco % 100) % 10;

    System.out.print("Troco: " + troco);
    System.out.print(", Notas de 100 reais: " + notas100);
    System.out.print(", Notas de 10 reais: " + notas10);
    System.out.print(", Notas de 1 real: " + notas1);
    teclado.close();







    }
}
