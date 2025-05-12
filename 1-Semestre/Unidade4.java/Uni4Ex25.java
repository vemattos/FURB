import java.util.Scanner;

public class Uni4Ex25 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Opção 1 = Soma de dois números.");
        System.out.println("Opção 2 = Diferença entre dois números.");
        System.out.println("Opção 3 = Produto entre dois números.");
        System.out.println("Opção 4 = Divisão entre dois números (o denominador não pode ser zero).");
        int opção = teclado.nextInt();
        System.out.println("Insira valor 1");
        int valor1 = teclado.nextInt();
        System.out.println("Insira valor 2");
        int valor2 = teclado.nextInt();

        if (opção == 1) {
            int soma = valor1 + valor2;
            System.out.println("Soma = " + soma);
        }
        else if (opção == 2) {
            int sub = valor1 - valor2;
            System.out.println("Diferença = " + sub);
        }
        else if (opção == 3) {
            int prod = valor1 * valor2;
            System.out.println("Produto = " + prod);
        }
        else if (opção == 4) {
            int div = valor1/valor2;
            System.out.println("Divisão = " + div);
        }
        else {
            System.out.println("Entrada incorreta");
        }
        teclado.close();   
    }
}