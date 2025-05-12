import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade de valores (N): ");
        int n = scanner.nextInt();

        if (n <= 20) {
            double[] vetor = new double[n];

            preencherVetor(vetor);
            imprimirTabela(vetor);
        } else {
            System.out.println("Quantidade inválida. O valor N deve ser no máximo 20.");
        }
        scanner.close();
    }

    public static void preencherVetor(double[] vetor) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe os valores do vetor:");

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Posição " + (i + 1) + ": ");
            vetor[i] = scanner.nextDouble();
        }

        System.out.println();
        scanner.close();
    }

    public static void imprimirTabela(double[] vetor) {
        Map<Double, Integer> valoresContados = new HashMap<>();

        for (double valor : vetor) {
            if (valoresContados.containsKey(valor)) {
                int quantidade = valoresContados.get(valor);
                valoresContados.put(valor, quantidade + 1);
            } else {
                valoresContados.put(valor, 1);
            }
        }

        System.out.println("Valores diferentes e suas frequências:");
        System.out.println("--------------------------------------");
        System.out.println("Valor\t|\tFrequência");
        System.out.println("--------------------------------------");

        for (Map.Entry<Double, Integer> entry : valoresContados.entrySet()) {
            System.out.println(entry.getKey() + "\t|\t" + entry.getValue());
        }

        System.out.println("--------------------------------------");
    }
}