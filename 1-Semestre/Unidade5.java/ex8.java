import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a quantidade de números que deseja comparar: ");
        int n = teclado.nextInt();

        int menorNegativo = 0;
        int somaPositivos = 0;
        int qtdPositivos = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o número " + (i+1) + ": ");
            int num = teclado.nextInt();

            if (num < 0 && num < menorNegativo) {
                menorNegativo = num;
            }

            if (num > 0) {
                somaPositivos += num;
                qtdPositivos++;
            }
        }
        System.out.println("O menor número negativo é " + menorNegativo);
        double mediaPositivos = (double) somaPositivos / qtdPositivos;
        System.out.println("A média dos números positivos é " + mediaPositivos);
        teclado.close();
    }
}