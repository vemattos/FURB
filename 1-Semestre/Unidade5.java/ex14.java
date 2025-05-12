import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroMercadorias = 20;
        int contadorLucroMenor10 = 0;
        int contadorLucroEntre10E20 = 0;
        int contadorLucroMaior20 = 0;
        double valorTotalCompra = 0;
        double valorTotalVenda = 0;
        double lucroTotal = 0;

        for (int i = 1; i <= numeroMercadorias; i++) {
            System.out.println("Insira o nome da mercadoria");
            System.out.print("Nome: ");
            String nomeMercadoria = scanner.next();
            System.out.print("Preço de compra: ");
            double precoCompra = scanner.nextDouble();
            System.out.print("Preço de venda: ");
            double precoVenda = scanner.nextDouble();

            double lucroPercentual = ((precoVenda - precoCompra) / precoCompra) * 100;

            if (lucroPercentual < 10) {
                contadorLucroMenor10++;
            } else if (lucroPercentual <= 20) {
                contadorLucroEntre10E20++;
            } else {
                contadorLucroMaior20++;
            }

            valorTotalCompra += precoCompra;
            valorTotalVenda += precoVenda;
            lucroTotal += (precoVenda - precoCompra);
        }

        System.out.println("=== Resultados ===");
        System.out.println("Mercadorias com lucro < 10%: " + contadorLucroMenor10);
        System.out.println("Mercadorias com 10% <= lucro <= 20%: " + contadorLucroEntre10E20);
        System.out.println("Mercadorias com lucro > 20%: " + contadorLucroMaior20);
        System.out.println("Valor total de compra: " + valorTotalCompra);
        System.out.println("Valor total de venda: " + valorTotalVenda);
        System.out.println("Lucro total: " + lucroTotal);

        scanner.close();
    }
}
