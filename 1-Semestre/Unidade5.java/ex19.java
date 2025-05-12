import java.util.Scanner;
public class ex19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double maiordescontado = 0;
        double menordescontado = 0;
        double somamaiordescontado =  0;
        double somamenordescontado = 0;

        while (true) {
            System.out.println("Insira o valor da compra");
            int valorcompra = teclado.nextInt();
            if (valorcompra == 0) {
                break;
            } else {
                if (valorcompra > 500) {
                    maiordescontado = valorcompra * 0.20;
                    somamaiordescontado += maiordescontado;
                    System.out.println("O valor a pagar é: " + maiordescontado);
                } else {
                    if (valorcompra <= 500) {
                        menordescontado = valorcompra * 0.15;
                        somamenordescontado += menordescontado;
                        System.out.println("O valor a pagar é: " + menordescontado);
                    }
                }
            }
        }
        double somafinal = somamaiordescontado + somamenordescontado;
        System.out.println("O valor total recebido pela loja ao final do dia foi de: " + somafinal);

        teclado.close();
    }
}