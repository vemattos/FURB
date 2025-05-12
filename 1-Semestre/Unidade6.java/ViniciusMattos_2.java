import java.util.Scanner;

public class ViniciusMattos_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o tamanho dos vetores: ");
        
        int tamanho = teclado.nextInt();
        int[] vetor1 = new int[tamanho];
        int[] vetor2 = new int[tamanho];
        int[] vetorResultado = new int[tamanho];        
        System.out.println("Popule o primeiro vetor:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Informe o valor para a posição " + i + ": ");
            vetor1[i] = teclado.nextInt();
        }
        System.out.println("Popule o segundo vetor:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Informe o valor para a posição " + i + ": ");
            vetor2[i] = teclado.nextInt();
        }
        for (int i = 0; i < tamanho; i++) {
            vetorResultado[i] = vetor1[i] + vetor2[i];
        }
        System.out.println("Vetor resultante da soma:");
        for (int i = 0; i < tamanho; i++) {
            System.out.print(vetorResultado[i] + " ");
        }
        teclado.close();
    }
}