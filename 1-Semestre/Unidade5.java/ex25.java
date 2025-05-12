import java.util.Scanner;
public class ex25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int pontosEsquerda = 0;
        int pontosDireita = 0;
        
        while (true) {
            System.out.println("Digite o código do ponto (D para direita, E para esquerda):");
            String codigoPonto = scanner.nextLine();
            
            if (codigoPonto.equalsIgnoreCase("D")) {
                pontosDireita++;
            } else if (codigoPonto.equalsIgnoreCase("E")) {
                pontosEsquerda++;
            } else {
                System.out.println("Código inválido. Digite D ou E.");
                continue;
            }
            
            if (pontosDireita >= 21 && pontosDireita - pontosEsquerda >= 2) {
                System.out.println("Jogador da direita venceu!");
                break;
            } else if (pontosEsquerda >= 21 && pontosEsquerda - pontosDireita >= 2) {
                System.out.println("Jogador da esquerda venceu!");
                break;
            }
        }
        
        scanner.close();
    }
}