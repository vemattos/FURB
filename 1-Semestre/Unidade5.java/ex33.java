import java.util.Scanner;

public class ex33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalVotos = 0;
        int votosCandidatos = 0;
        int votosNulos = 0;
        int votosBrancos = 0;
        int voto;

        do {
            System.out.print("Digite o código do voto (1-4 para candidatos, 5 para nulo, 6 para branco, 0 para finalizar): ");
            voto = scanner.nextInt();

            switch (voto) {
                case 1:
                case 2:
                case 3:
                case 4:
                    votosCandidatos++;
                    totalVotos++;
                    break;
                case 5:
                    votosNulos++;
                    totalVotos++;
                    break;
                case 6:
                    votosBrancos++;
                    totalVotos++;
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção incorreta. Digite um número de opção válido.");
                    break;
            }
        } while (voto != 0);

        System.out.println("\nResultado da votação:");
        System.out.println("Total de votos para o candidato 1: " + votosCandidatos);
        System.out.println("Total de votos para o candidato 2: " + votosCandidatos);
        System.out.println("Total de votos para o candidato 3: " + votosCandidatos);
        System.out.println("Total de votos para o candidato 4: " + votosCandidatos);
        System.out.println("Total de votos nulos: " + votosNulos);
        System.out.println("Total de votos em branco: " + votosBrancos);

        double percentualNulos = (double) votosNulos / totalVotos * 100;
        double percentualBrancos = (double) votosBrancos / totalVotos * 100;

        System.out.println("Percentual de votos nulos sobre o total: " + percentualNulos + "%");
        System.out.println("Percentual de votos em branco sobre o total: " + percentualBrancos + "%");

        scanner.close();
    }
}