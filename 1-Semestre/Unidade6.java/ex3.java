import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        double[] vetor = new double[12];
        
        lerValores(vetor);
        ajustarValores(vetor);
        escreverValores(vetor);
    }
    
    public static void lerValores(double[] vetor) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite os 12 valores:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.nextDouble();
        }
        
        scanner.close();
    }
    
    public static void ajustarValores(double[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            if (i % 2 == 0) { // posições pares
                vetor[i] *= 1.02; // aumenta em 2%
            } else { // posições ímpares
                vetor[i] *= 1.05; // aumenta em 5%
            }
        }
    }
    
    public static void escreverValores(double[] vetor) {
        System.out.println("Vetor resultante:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }
    }
}