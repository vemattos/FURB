import java.util.Scanner;

public class ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroInscricaoMaisAlto = 0;
        double alturaMaisAlto = 0;

        int numeroInscricaoMaisBaixo = 0;
        double alturaMaisBaixo = Double.MAX_VALUE;

        int quantidadeAtletas = 0;
        double somaAlturaTotal = 0;

        System.out.println("Digite o número de inscrição e a altura (em centímetros) dos atletas:");
        System.out.println("Para finalizar a entrada, digite 0 para o número de inscrição.");

        while (true) {
            System.out.print("Número de inscrição: ");
            int numeroInscricao = scanner.nextInt();

            if (numeroInscricao == 0) {
                break;
            }

            System.out.print("Altura: ");
            double altura = scanner.nextDouble();

            if (altura > alturaMaisAlto) {
                numeroInscricaoMaisAlto = numeroInscricao;
                alturaMaisAlto = altura;
            }

            if (altura < alturaMaisBaixo) {
                numeroInscricaoMaisBaixo = numeroInscricao;
                alturaMaisBaixo = altura;
            }

            quantidadeAtletas++;
            somaAlturaTotal += altura;
        }

        double alturaMedia = quantidadeAtletas > 0 ? somaAlturaTotal / quantidadeAtletas : 0;

        System.out.println("Atleta mais alto:");
        System.out.println("Número de inscrição: " + numeroInscricaoMaisAlto);
        System.out.println("Altura: " + alturaMaisAlto + " cm");

        System.out.println("Atleta mais baixo:");
        System.out.println("Número de inscrição: " + numeroInscricaoMaisBaixo);
        System.out.println("Altura: " + alturaMaisBaixo + " cm");

        System.out.println("Altura média do grupo: " + alturaMedia + " cm");

        scanner.close();
    }
}