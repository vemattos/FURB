import java.util.Scanner;

public class Uni4Ex27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Lê a hora e o minuto de chegada
        System.out.print("Hora de chegada (hh mm): ");
        int horaChegada = input.nextInt();
        int minChegada = input.nextInt();

        // Lê a hora e o minuto de partida
        System.out.print("Hora de partida (hh mm): ");
        int horaPartida = input.nextInt();
        int minPartida = input.nextInt();

        // Calcula o tempo de permanência em minutos
        int tempoPermanencia = (horaPartida * 60 + minPartida) - (horaChegada * 60 + minChegada);

        // Se a permanência for menor que 30 minutos, arredonda para 1 hora
        if (tempoPermanencia < 30) {
            tempoPermanencia = 60;
        }

        // Calcula o número de horas de permanência
        int horasPermanencia = (int) Math.ceil(tempoPermanencia / 60.0);

        // Calcula o preço a ser cobrado de acordo com as tarifas
        double preco;
        if (horasPermanencia <= 2) {
            preco = horasPermanencia * 5.0;
        } else if (horasPermanencia <= 4) {
            preco = 2 * 5.0 + (horasPermanencia - 2) * 7.5;
        } else {
            preco = 2 * 5.0 + 2 * 7.5 + (horasPermanencia - 4) * 10.0;
        }

        // Imprime o tempo de permanência e o preço a ser cobrado
        System.out.println("Tempo de permanência: " + horasPermanencia + " horas");
        System.out.println("Preço a ser cobrado: R$ " + preco);
        input.close();
    }
}
