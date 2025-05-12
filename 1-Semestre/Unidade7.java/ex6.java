import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade de valores (N): ");
        int n = scanner.nextInt();

        double[] vetor = new double[n];

        lerVetor(vetor);
        
        System.out.print("Informe um valor real para verificar se está no vetor: ");
        double valor = scanner.nextDouble();

        boolean encontrado = verificarValor(vetor, valor);

        if (encontrado) {
            System.out.println("O valor " + valor + " está presente no vetor.");
        } else {
            System.out.println("O valor " + valor + " não está presente no vetor.");
        }
        scanner.close();
    }

    public static void lerVetor(double[] vetor) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe os valores do vetor:");

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Posição " + (i + 1) + ": ");
            vetor[i] = scanner.nextDouble();
        }

        System.out.println();
        scanner.close();
    }

    public static boolean verificarValor(double[] vetor, double valor) {
        for (double elemento : vetor) {
            if (elemento == valor) {
                return true;
            }
        }
        return false;
    }
}