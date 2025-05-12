import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a quantidade de números que deseja comparar: ");
        int n = input.nextInt();

        double maior = Double.NEGATIVE_INFINITY;
        double menor = Double.POSITIVE_INFINITY;

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o número " + (i+1) + ": ");
            double num = input.nextDouble();

            if (num > maior) {
                maior = num;
            }

            if (num < menor) {
                menor = num;
            }
        }

        System.out.println("O maior número é " + maior);
        System.out.println("O menor número é " + menor);
        
        input.close();
    }
}
