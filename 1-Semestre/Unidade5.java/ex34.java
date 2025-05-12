import java.util.Scanner;

public class ex34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numeroContasEncerradas = 0;
        
        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("(1) Encerrar conta de um hóspede");
            System.out.println("(2) Verificar número de contas encerradas");
            System.out.println("(3) Sair");
            
            int opcao = scanner.nextInt();
            
            if (opcao == 1) {
                System.out.print("Digite o nome do hóspede: ");
                String nome = scanner.next();
                
                System.out.print("Digite o número de diárias: ");
                int numeroDiarias = scanner.nextInt();
                
                double taxaServicos;
                if (numeroDiarias < 15) {
                    taxaServicos = 7.50;
                } else if (numeroDiarias == 15) {
                    taxaServicos = 6.50;
                } else {
                    taxaServicos = 5.00;
                }
                
                double totalPagar = 50.00 * numeroDiarias + taxaServicos;
                
                System.out.println("Nome: " + nome);
                System.out.println("Total a ser pago: R$" + totalPagar);
                
                numeroContasEncerradas++;
            } else if (opcao == 2) {
                System.out.println("Número de contas encerradas: " + numeroContasEncerradas);
            } else if (opcao == 3) {
                break;
            } else {
                System.out.println("Opção inválida. Digite novamente.");
            }
        }
        
        scanner.close();
    }
}