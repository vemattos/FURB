package exercicios2;

import java.util.Scanner;

public class U3ex4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira nota 1");
        int nota1 = teclado.nextInt();
        System.out.println("Insira nota 2");
        int nota2 = teclado.nextInt();
        System.out.println("Insira nota 3");
        int nota3 = teclado.nextInt();

        double notafinal = ((nota1 * 5) + (nota2 * 3) + (nota3 * 2) / 10);

        System.out.println("A média ponderada do aluno é " + notafinal);
        teclado.close();
    }
}
