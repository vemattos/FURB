import java.util.Scanner;

public class Uni4Ex20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe a nota 1");
        int nota1 = teclado.nextInt();
        System.out.println("Informe a nota 2");
        int nota2 = teclado.nextInt();
        System.out.println("Informe a nota 3");
        int nota3 = teclado.nextInt();
        System.out.println("Informe a nota dos exercícios");
        int ex = teclado.nextInt();

        double media = (nota1 + (nota2 * 2) + (nota3 * 3 ) + ex) / 7;

        if (media < 4.0) {
            System.out.println("Conceito E, reprovado com média: " + media);
        }
        else if (media >= 4.0 && media < 6.0) {
            System.out.println("Conceito D, reprovado com média: " + media);
        }
        else if (media >= 6.0 && media < 7.5) {
            System.out.println("Conceito C, aprovado com média: " + media);
        }
        else if (media >= 7.5 && media < 9.0) {
            System.out.println("Conceito B, aprovado com média: " + media);
        }
        else if (media >= 9.0) {
            System.out.println("Conceito A, aprovado com média " + media);
        }
        teclado.close();

    }
}
