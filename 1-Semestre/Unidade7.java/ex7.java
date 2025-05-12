import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade de valores (N): ");
        int n = scanner.nextInt();

        if (n <= 20) {
            int[] vetor = new int[n];

            inserirValores(vetor);
            ordenarVetor(vetor);
            exibirVetor(vetor);
        } else {
            System.out.println("Quantidade inválida. O valor N deve ser no máximo 20.");
        }
        scanner.close();
    }

    public static void inserirValores(int[] vetor) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe os valores do vetor:");

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Posição " + (i + 1) + ": ");
            int valor = scanner.nextInt();

            if (!verificarExistencia(vetor, valor, i)) {
                vetor[i] = valor;
            } else {
                System.out.println("Valor repetido. Informe outro valor.");
                i--;
            }
        }

        System.out.println();
        scanner.close();
    }

    public static boolean verificarExistencia(int[] vetor, int valor, int limite) {
        for (int i = 0; i < limite; i++) {
            if (vetor[i] == valor) {
                return true;
            }
        }
        return false;
    }

    public static void ordenarVetor(int[] vetor) {
        int n = vetor.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int temp = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = temp;
                }
            }
        }
    }

    public static void exibirVetor(int[] vetor) {
        System.out.print("Vetor ordenado: ");
        for (int valor : vetor) {
            System.out.print("[" + valor + "]");
        }
        System.out.println();
    }
}