import java.util.Scanner;
public class ex29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] cedulas = {20, 10, 5, 2, 1};
        
        System.out.print("Digite o valor desejado: ");
        int valor = scanner.nextInt();
        
        int quantidadeCedulas = 0;
        
        for (int i = 0; i < cedulas.length; i++) {
            quantidadeCedulas += valor / cedulas[i];
            valor %= cedulas[i];
        }
        
        System.out.println("Quantidade mínima de cédulas: " + quantidadeCedulas);
        
        scanner.close();
    }
}

