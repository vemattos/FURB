import java.util.Scanner;

public class ex13p2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int distanciatotal = 0;
        int combustiveltotal = 0;

        System.out.println("Insira o número de reabastecimentos: ");
        int numreabastecimentos = teclado.nextInt();

        System.out.println("Insira os dados para cada reabastecimento: ");
        for (int i = 1; i <= numreabastecimentos; i++) {
            System.out.println("Reabastecimento " + i);
            System.out.println("Odômetro antes do reabastecimento: ");
            int odometroantes = teclado.nextInt();
            System.out.println("Odômetro depois do reabastecimento: ");
            int odometrodepois = teclado.nextInt();
            System.out.println("Quantidade de combustível comprado (em litros): ");
            int combustivelcomprado = teclado.nextInt();

            double distanciapercorrida = odometroantes - odometrodepois;
            double consumoportlitro = distanciapercorrida / combustivelcomprado;

            System.out.println("Quilometragem obtida por litro de combustível: " + consumoportlitro);

            distanciatotal += distanciapercorrida;
            combustiveltotal += combustivelcomprado;
        }
        double consumomediototal = distanciatotal / combustiveltotal;
        System.out.println("Quilometragem média obtida por litro de combustível em toda a viagem " + consumomediototal);
        teclado.close();
    }
}
