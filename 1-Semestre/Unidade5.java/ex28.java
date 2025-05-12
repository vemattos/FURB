import java.util.Scanner;
public class ex28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] votos = new int[4];
        String[] conjuntos = {"Nenhum de Nós", "CPM22", "Skank", "Jota Quest"};
        
        int totalVotos = 0;
        int vencedorIndex = 0;
        
        while (true) {
            System.out.println("Mais um voto? (s/n): ");
            String opcao = scanner.next();
            
            if (!opcao.equalsIgnoreCase("s")) {
                break;
            }
            
            System.out.println("Informe o código do conjunto (1 a 4): ");
            int codigo = scanner.nextInt();
            
            if (codigo >= 1 && codigo <= 4) {
                votos[codigo - 1]++;
                totalVotos++;
            } else {
                System.out.println("Código inválido. Voto não contabilizado.");
            }
        }
        
        System.out.println("Resultado da eleição:");
        
        for (int i = 0; i < votos.length; i++) {
            double percentual = (double) votos[i] / totalVotos * 100;
            System.out.println(conjuntos[i] + ": " + votos[i] + " votos (" + percentual + "%)");
            
            if (votos[i] > votos[vencedorIndex]) {
                vencedorIndex = i;
            }
        }
        
        System.out.println("O grupo vencedor é: " + conjuntos[vencedorIndex]);
        
        scanner.close();
    }
}
