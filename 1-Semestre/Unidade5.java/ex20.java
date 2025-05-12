import java.util.Scanner;

public class ex20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a massa inicial em Kg: ");
        double massaInicial = teclado.nextDouble();

        double massaFinal = massaInicial;
        int tempo = 0;

        while (massaFinal > 0.0005) {
            massaFinal /= 2; // Metade da massa a cada 50 segundos
            tempo += 50;
        }
        System.out.println("Massa inicial: " + massaInicial + " Kg");
        System.out.println("Massa final: " + massaFinal + " Kg");
        System.out.println("Tempo necessário: " + tempo + " segundos");
        teclado.close();
    }
}
