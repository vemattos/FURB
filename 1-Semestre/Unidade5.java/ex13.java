import java.util.Scanner;
public class ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número total de reabastecimentos: ");
        int numeroReabastecimentos = scanner.nextInt();

        double distanciaTotal = 0;
        double combustivelTotal = 0;

        System.out.println("Digite os dados para cada reabastecimento:");
        for (int i = 1; i <= numeroReabastecimentos; i++) {
            System.out.println("Reabastecimento " + i + ":");
            System.out.print("   Odômetro antes do reabastecimento: ");
            double odometroAntes = scanner.nextDouble();
            System.out.print("   Odômetro depois do reabastecimento: ");
            double odometroDepois = scanner.nextDouble();
            System.out.print("   Quantidade de combustível comprado (em litros): ");
            double combustivelComprado = scanner.nextDouble();

            double distanciaPercorrida = odometroDepois - odometroAntes;
            double consumoPorLitro = distanciaPercorrida / combustivelComprado;

            System.out.println("   Quilometragem obtida por litro de combustível: " + consumoPorLitro);

            distanciaTotal += distanciaPercorrida;
            combustivelTotal += combustivelComprado;
        }

        double consumoMedioTotal = distanciaTotal / combustivelTotal;

        System.out.println("Quilometragem média obtida por litro de combustível na viagem: " + consumoMedioTotal);

        scanner.close();
    }
}

