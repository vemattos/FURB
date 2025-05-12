import java.text.DecimalFormat;
import java.util.Scanner;

public class ViniciusMattos_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df_3 = new DecimalFormat("0.00");

        int chapa1 = 0;
        int chapa2 = 0;
        int votosnulo = 0;
        int votostotais = 0;
        System.out.println("1 = Chapa 1");
        System.out.println("2 = Chapa 2");
        System.out.println("3 = Nulo");
        int opcao;
        do {
            System.out.print("Digite o número da chapa (9 para encerrar a votação): ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    chapa1++;
                    votostotais++;
                    System.out.println("Voto registrado para a Chapa 1");
                    break;
                case 2:
                    chapa2++;
                    votostotais++;
                    System.out.println("Voto registrado para a Chapa 2");
                    break;
                case 3:
                    votosnulo++;
                    votostotais++;
                    System.out.println("Voto anulado");
                    break;
                case 9:
                    System.out.println("Votação encerrada");
                    break;
                default:
                    System.out.println("Opção incorreta, Tente novamente");
                    break;
            }
        } while (opcao != 9);

        System.out.println("Total de votos: " + votostotais); 
        System.out.println("Chapa 1 recebeu " + chapa1 + " voto(s)");
        double percentual1 = (chapa1 * 100) / votostotais;
        System.out.println("Percentual de votos para Chapa 1: " + df_3.format(percentual1) + " %");
        System.out.println("Chapa 2 recebeu " + chapa2 + " voto(s)");
        double percentual2 = (chapa2 * 100) / votostotais;
        System.out.println("Percentual de votos para Chapa 2: " + df_3.format(percentual2) + " %");
        System.out.println("Votos anulados " + votosnulo + " voto(s)");
        double percentual3 = (votosnulo * 100) / votostotais;
        System.out.println("Percentual de votos nulos: " + df_3.format(percentual3) + " %");
        if (chapa1 == chapa2) {
            System.out.println("EMPATE NA VOTAÇÃO");
        }
        scanner.close();
    }
}