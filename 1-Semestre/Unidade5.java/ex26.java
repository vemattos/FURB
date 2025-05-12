import java.util.Scanner;
public class ex26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Valor máximo de pedágio: ");
        double valorMaximoPedagio = scanner.nextDouble();
        
        int trechosAcimaValorMaximo = 0;
        int quantidadeTrechos = 0;
        int trechosAcima150Km = 0;
        
        while (true) {
            System.out.println("Pedágio: R$");
            double pedagio = scanner.nextDouble();
            
            if (pedagio < 0) {
                break; // Encerra o programa quando o valor do pedágio for negativo
            }
            
            System.out.println("Distância (em Km): ");
            int distancia = scanner.nextInt();
            
            quantidadeTrechos++;
            
            if (pedagio > valorMaximoPedagio) {
                trechosAcimaValorMaximo++;
            }
            
            if (distancia > 150 && pedagio <= valorMaximoPedagio) {
                trechosAcima150Km++;
            }
        }
        
        System.out.println(trechosAcimaValorMaximo + " (trechos com valor acima do qual ele nega-se a pagar)");
        System.out.println(quantidadeTrechos + " (quantidade de trechos informados)");
        System.out.println(trechosAcima150Km + " (trechos acima de 150km com valor aceito por ele)");
        
        scanner.close();
    }
}

