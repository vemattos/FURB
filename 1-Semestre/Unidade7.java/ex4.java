import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] vetor3 = new int[10];

        lerValores(vetor1, "Vetor 1");
        lerValores(vetor2, "Vetor 2");
        somarVetores(vetor1, vetor2, vetor3);
        escreverVetores(vetor1, vetor2, vetor3);
    }

    public static void lerValores(int[] vetor, String nomeVetor) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os valores do " + nomeVetor + ":");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Posição " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.println();
    }

    public static void somarVetores(int[] vetor1, int[] vetor2, int[] vetor3) {
        for (int i = 0; i < vetor1.length; i++) {
            vetor3[i] = vetor1[i] + vetor2[i];
        }
    }
    
    public static void escreverVetores(int[] vetor1, int[] vetor2, int[] vetor3) {
        System.out.println("Vetor 1:");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.print(vetor1[i] + " ");
        }
        System.out.println();

        System.out.println("Vetor 2:");
        for (int i = 0; i < vetor2.length; i++) {
            System.out.print(vetor2[i] + " ");
        }
        System.out.println();

        System.out.println("Vetor 3 (soma):");
        for (int i = 0; i < vetor3.length; i++) {
            System.out.print(vetor3[i] + " ");
        }
        System.out.println();
    
    }
}