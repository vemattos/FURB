import java.util.Scanner;
public class ex23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;
        
        while (continuar) {
            System.out.println("Digite o nome do vendedor:");
            String nome = scanner.nextLine();
            
            System.out.println("Digite o número de produtos vendidos pelo vendedor:");
            int numProdutos = scanner.nextInt();
            
            double totalVendas = 0;
            for (int i = 1; i <= numProdutos; i++) {
                System.out.println("Digite o preço unitário do produto " + i + ":");
                double precoUnitario = scanner.nextDouble();
                
                System.out.println("Digite a quantidade vendida do produto " + i + ":");
                int quantidadeVendida = scanner.nextInt();
                
                totalVendas += precoUnitario * quantidadeVendida;
            }
            
            double salario = totalVendas * 0.3; // 30% de comissão sobre as vendas
            
            System.out.println("Nome: " + nome);
            System.out.println("Total de vendas: R$" + totalVendas);
            System.out.println("Salário: R$" + salario);
            
            System.out.println("Deseja digitar os dados de mais um vendedor? (s/n)");
            String resposta = scanner.next();
            if (!resposta.equalsIgnoreCase("s")) {
                continuar = false;
            }
            
            // Limpar o buffer do scanner
            scanner.nextLine();
        }
        
        scanner.close();
    }
}