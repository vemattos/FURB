package exercicios2;

import java.util.Scanner;

public class U3ex11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o valor em °C: ");
        int grau = teclado.nextInt();

        double far = grau * 9/5 + 32;

        System.out.print("A temperatura em °F é: " + far);
        teclado.close();
    }
}
