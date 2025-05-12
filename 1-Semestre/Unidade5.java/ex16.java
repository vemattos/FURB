import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeMulheres = 0;
        double somaAlturaMulheres = 0;
        int quantidadePessoas = 0;
        double somaAlturaTotal = 0;

        System.out.println("Digite a altura (em centímetros) e o sexo (M/F) das pessoas:");
        System.out.println("Para finalizar a entrada, digite 0 para a altura.");

        while (true) {
            System.out.print("Altura: ");
            double altura = scanner.nextDouble();

            if (altura == 0) {
                break;
            }

            System.out.print("Sexo (M/F): ");
            String sexo = scanner.next();

            if (sexo.equalsIgnoreCase("F")) {
                quantidadeMulheres++;
                somaAlturaMulheres += altura;
            }

            quantidadePessoas++;
            somaAlturaTotal += altura;
        }

        double mediaAlturaMulheres = quantidadeMulheres > 0 ? somaAlturaMulheres / quantidadeMulheres : 0;
        double mediaAlturaTotal = quantidadePessoas > 0 ? somaAlturaTotal / quantidadePessoas : 0;

        System.out.println("Média de altura das mulheres: " + mediaAlturaMulheres + " cm");
        System.out.println("Média de altura do grupo: " + mediaAlturaTotal + " cm");

        scanner.close();
    }
}