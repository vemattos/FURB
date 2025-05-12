import java.util.Scanner;
import java.util.Arrays;

public class ViniciusMattos_3 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Informe o tamanho dos vetores: ");
        int tamanho = scanner.nextInt();

        
        int[] vetor1 = new int[tamanho];
        int[] vetor2 = new int[tamanho];
        int[] vetorResultado = new int[tamanho];

        
        System.out.println("Popule o primeiro vetor:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Informe o valor para a posição " + i + ": ");
            vetor1[i] = scanner.nextInt();
        }

        
        System.out.println("Popule o segundo vetor:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Informe o valor para a posição " + i + ": ");
            vetor2[i] = scanner.nextInt();
        }

        
        for (int i = 0; i < tamanho; i++) {
            vetorResultado[i] = vetor1[i] + vetor2[i];
        }

        System.out.println("Vetor resultante da soma:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetorResultado[i] + " ");
        }
        scanner.close();
    }
    public static void popularVetor(){
        System.out.println("Popule o primeiro vetor:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Informe o valor para a posição " + i + ": ");
            vetor1[i] = scanner.nextInt();
        }

        
        System.out.println("Popule o segundo vetor:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Informe o valor para a posição " + i + ": ");
            vetor2[i] = scanner.nextInt();
        }
        
    }
}