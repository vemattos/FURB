import java.util.Scanner;

public class Uni4Ex16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira a idade do homem 1");
        int homem1 = teclado.nextInt();
        System.out.println("Insira a idade do homem 2");
        int homem2 = teclado.nextInt();
        System.out.println("Insira a idade da mulher 1");
        int mulher1 = teclado.nextInt();
        System.out.println("Insira a idade da mulher 2");
        int mulher2 = teclado.nextInt();

        if (homem1 > homem2 && mulher1 > mulher2) {
            int soma = homem1 + mulher1;
            int mult = homem2 * mulher2;
            System.out.println("Soma = " + soma);
            System.out.println("Multiplicação = " + mult);
        }
        if (homem2 > homem1 && mulher2 > mulher1) {
            int soma = homem2 + mulher2;
            int mult = homem1 * mulher1;
            System.out.println("Soma = " + soma);
            System.out.println("Multiplicação = " + mult);
        }
        if (homem1 > homem2 && mulher2 > mulher1) {
            int soma = homem1 + mulher2;
            int mult = homem2 * mulher1;
            System.out.println("Soma = " + soma);
            System.out.println("Multiplicação = " + mult);
        }
        if (homem2 > homem1 && mulher1 > mulher2) {
            int soma = homem2 + mulher1;
            int mult = homem1 * mulher2;
            System.out.println("Soma = " + soma);
            System.out.println("Multiplicação = " + mult);
        }
        teclado.close();
    }
}
