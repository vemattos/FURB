import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor inicial (N): ");
        int n = scanner.nextInt();

        System.out.print("Digite o decremento (K): ");
        int k = scanner.nextInt();

        System.out.print("Digite o tamanho da mochila (M): ");
        int m = scanner.nextInt();

        List<Integer> elementosColocados = new ArrayList<>();
        List<Integer> elementosFora = new ArrayList<>();

        int somaColocados = 0;
        int somaFora = 0;

        while (m >= n) {
            if (m - n >= 0) {
                elementosColocados.add(n);
                somaColocados += n;
                m -= n;
            } else {
                elementosFora.add(n);
                somaFora += n;
            }

            n -= k;
        }

        System.out.println("Elementos colocados na mochila: " + elementosColocados);
        System.out.println("Elementos fora da mochila: " + elementosFora);
        System.out.println("Soma dos elementos colocados na mochila: " + somaColocados);
        System.out.println("Soma dos elementos fora da mochila: " + somaFora);

        scanner.close();
    }
}