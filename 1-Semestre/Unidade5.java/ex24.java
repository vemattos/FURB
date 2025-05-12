import java.util.Scanner;
public class ex24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o limite diário de peso (em quilogramas):");
        double limiteDiario = scanner.nextDouble();
        
        double pesoTotal = 0;
        boolean excedeuLimite = false;
        boolean continuar = true;
        
        while (continuar && !excedeuLimite) {
            System.out.println("Digite o peso do peixe (em gramas):");
            double pesoPeixe = scanner.nextDouble() / 1000; // Converter de gramas para quilogramas
            
            pesoTotal += pesoPeixe;
            
            if (pesoTotal > limiteDiario) {
                excedeuLimite = true;
                System.out.println("Limite diário excedido!");
            } else {
                System.out.println("Peso total da pesca até o momento: " + pesoTotal + " kg");
                
                System.out.println("Deseja informar o peso de mais um peixe? (s/n)");
                String resposta = scanner.next();
                if (!resposta.equalsIgnoreCase("s")) {
                    continuar = false;
                }
            }
        }
        
        scanner.close();
    }
}
